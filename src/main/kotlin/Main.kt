fun main() {
    val post = Post(text = "Cats", likes = Likes(150))
    println(WallService.add(post))
}
