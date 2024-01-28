data class Post(
    val id: Int = 0,                     //Идентификатор записи
    val text: String,                    //Текст записи.
    val date: Int = 0,                   //Время публикации записи
    val canEdit: Boolean = true,         //может ли владелец поста его редактировать - да
    val canDelete: Boolean = true,          //Информация о том, может ли текущий пользователь удалить запись - да.
    val isFavorite: Boolean = false,    // если объект добавлен в закладки у текущего пользователя - да
    val fromId: Int = 0,                //Идентификатор автора записи (от чьего имени опубликована запись).

    var likes: Likes
)

data class Likes(val count: Int = 0)

