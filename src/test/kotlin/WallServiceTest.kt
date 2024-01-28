import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clear() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val post = WallService.add(Post(text = "text", likes = Likes(1)))
        val result = post.id
        assertNotEquals(result, 0)
    }

    @Test
    fun updateExisting() {
        WallService.add(Post(text = "Cat", likes = Likes(130)))
        WallService.add(Post(text = "Cat2", likes = Likes(140)))
        WallService.add(Post(text = "Cat3", likes = Likes(150)))

        val update = Post(3, "Dog", likes = Likes(80))
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        WallService.add(Post(text = "Cat", likes = Likes(94)))
        WallService.add(Post(text = "Cat2", likes = Likes(64)))
        WallService.add(Post(text = "Cat3", likes = Likes(85)))
        WallService.add(Post(text = "Cat4", likes = Likes(34)))

        val update = Post(5, "Frog", likes = Likes(19))
        val result = WallService.update(update)
        assertFalse(result)
    }
}