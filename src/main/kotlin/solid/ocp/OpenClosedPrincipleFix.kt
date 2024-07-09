package solid.ocp

internal interface Content
internal object AdService {
    // returns an ad
    fun fetchAd(u: User?): Content {}
}

internal object ContentService {
    // returns some content
    fun fetchContent(u: User?): Content {}
}

internal interface Playable {
    fun broadcastContentToUsers(users: Set<User>)
    fun playMusicWithAds(freeUser: FreeUser)
    fun play(content: Content?)
}

internal enum class Quality {
    HIGH, VERY_HIGH
}

internal enum class UserType {
    FREE, PREMIUM, SUPER_PREMIUM
}

internal class User {
    var type: UserType? = null
}

internal class FreeUser : User() {
    private val secondsSinceLastAd: Long = 0
}

internal class PremiumUser : User()

internal class SuperPremiumUser: User()

