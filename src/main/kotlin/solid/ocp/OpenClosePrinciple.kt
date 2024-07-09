package solid.ocp

internal interface Content

internal object AdService {
    // returns an ad
    fun fetchAd(u: User?): Content {
       makeContent(u.getQuality())
    }
}

internal object ContentService {
    // returns some content
    fun fetchContent(u: User?): Content {}
}

internal enum class Quality {
    HIGH, VERY_HIGH
}


internal enum class UserType {
    FREE, PREMIUM
}

internal interface User {
    fun getQuality(): Quality
    fun getContent(): Content
}

internal class FreeUser(player: Player) : User {
    private val secondsSinceLastAd: Long = 0

    override fun getQuality(): Quality {
        TODO("Not yet implemented")
    }

    override fun getContent(): Content {
        if (getSecondsSinceLastAd() > 600) {
            return AdService.fetchAd(this)
        }
        return ContentService.fetchContent(this))
    }
}

internal class FreemiumUser : User {
    override fun getQuality(): Quality {
        TODO("Not yet implemented")
    }

    override fun getContent(): Content {
        TODO("Not yet implemented")
    }
}


internal class MusicPlayer {
    fun broadcastContentToUsers(users: Set<User>) {
        for (user in users) {
            setPlaybackMode(user.getQuality())
            play(ContentService.fetchContent(user))
        }
    }

    fun play(content: Content?) {
         //plays the given content

    }

    fun setPlaybackMode(quality: Quality){

    }
}

fun main() {
    val freePlayer = object : Player {
        override fun playMusic() {

        }
    }

    val freeUser = FreeUser()
}
