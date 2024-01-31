data class Photo(
    val id: Int, //Идентификатор фотографии.
    val albumId: Int, //Идентификатор альбома, в котором находится фотография.
    val ownerId: Int, // Идентификатор владельца фотографии.
    val userId: Int, //Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String, //Текст описания фотографии.
    val date: Long = System.currentTimeMillis() //Дата добавления в формате Unixtime.
)

data class Audio(
    val id: Int, //Идентификатор аудиозаписи.
    val ownerId: Int, //Идентификатор владельца аудиозаписи.
    val artist: String, //Исполнитель.
    val title: String, //Название композиции.
    val duration: Int //Длительность аудиозаписи в секундах.
)

data class Video(
    val id: Int, //Идентификатор видеозаписи.
    val ownerId: Int, //Идентификатор владельца видеозаписи.
    val title: String, //Название видеозаписи.
    val description: String,//Текст описания видеозаписи.
    val duration: Int //Длительность ролика в секундах.
)

data class File(
    val id: Int,//Идентификатор файла.
    val ownerId: Int,//Идентификатор пользователя, загрузившего файл.
    val title: String, //Название файла.
    val size: Int,//Размер файла в байтах.
    val ext: String, //Расширение файла.
)

data class Gift(
    val id: Int,//Идентификатор подарка.
    val thumb_256: String,//URL изображения 256x256px.
    val thumb_96: String,//URL изображения 96x96px.
    val thumb_48: String// URL изображения 48x48px.
)
