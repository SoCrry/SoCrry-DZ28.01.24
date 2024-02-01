object WallService {
    private var posts = emptyArray<Post>()
    private var LastId = 0
    private var commentId = 0
    private var comments = emptyArray<Comment>()

    fun clear() {
        posts = emptyArray()
        LastId = 0
        // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }

    fun add(post: Post): Post {
        posts += post.copy(id = ++LastId, likes = post.likes.copy())
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likes = post.likes.copy())
                return true
            }
        }
        return false
    }

    private fun findById(id: Int): Post? {
        for (post in posts) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        val post = findById(postId) ?: throw PostNotFoundException("post not found")
        commentId += 1
        val newComment = comment.copy(id = commentId, fromId = comment.fromId ?: post.fromId)
        comments += newComment
        return newComment
    }

}