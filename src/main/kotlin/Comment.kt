data class Comment(
    val id: Int = 0,//Идентификатор комментария.
    val fromId: Int? = null,//Идентификатор автора комментария.
    val date: Long = 0,//Дата создания комментария в формате Unixtime.
    val text: String,//Текст комментария.
)
