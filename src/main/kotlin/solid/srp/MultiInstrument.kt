package solid.srp


sealed class Note(val song :String) {
    data object DrumNote : Note("drum")
    data object BassNote : Note("bass")
    data object GuitarNote : Note("guitar")
}

class MultiInstrument(private val volume: Double) {

    internal fun playDrums(note: Note) {
        /* Some fancy drum-playing code... */
    }

    fun playBass(note: Note) {
        /* Some fancy bass-playing code... */
    }

    fun playGuitar(note: Note) {
        /* Some fancy guitar-playing code... */
    }

    fun singVocals(note: Note) {
        /* Some fancy code for singing vocals... */
    }

    fun newInstrument(note: Note){

    }
}

