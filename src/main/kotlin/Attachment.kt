interface Attachment {
    val type: String
}

class PhotoAttachment(param: Photo) : Attachment {
    override val type: String = "photo"
    val photo = param
}

class AudioAttachment(param: Audio) : Attachment {
    override val type: String = "audio"
    val audio = param
}

class VideoAttachment(param: Video) : Attachment {
    override val type: String = "video"
    val video = param
}

class FileAttachment(param: File) : Attachment {
    override val type: String = "file"
    val video = param
}

class GiftAttachment(param: Gift) : Attachment {
    override val type: String = "gift"
    val gift = param

}
