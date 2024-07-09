package solid.ocp

/**
 * That's all well and good. Your product manager asked you to implement a content player, and the above code will do just that.
 * However, a couple of years down the road, when the AI scene has gotten a new breakthrough, your product manager comes to you in a panic and exclaims, "We have to support ChatGPT Music Generator DJ!! Quickly!!"
 */

interface Content

class Track : Content {
    fun play() { }
}

class Playlist : Content {
    private val tracks: List<Track>

    fun playAllTracks() { }

    // Constructor
    init {
        tracks = listOf()
    }
}

class Podcast : Content {
    fun playEpisodes(lastPosition: Position) { }
}

class Audiobook : Content {
    fun playChapter(lastPosition: Position) { }
}

class Player {
    fun playContent(content: Content, lastPosition: Position) {
        if (content is Track) {
            content.play()
        } else if (content is Playlist) {
            content.playAllTracks()
        } else if (content is Podcast) {
            content.playEpisodes(lastPosition)
        } else if (content is Audiobook) {
            content.playChapter(lastPosition)
        }
    }
}