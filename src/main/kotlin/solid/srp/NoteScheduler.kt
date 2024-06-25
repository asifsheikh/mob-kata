package solid.srp

class NoteSchedulerFix(
    private val instrument: Instrument
) {

    fun onNote(note: Note) {
        instrument.playNote(note)
    }
}

class NoteScheduler {
    private val instrument = MultiInstrument(1.0)
    fun onNote(note: Note?) {
        when (Note) {
            is Note.DrumNote -> {
                instrument.playDrums(note!!)
            }

            is Note.BassNote -> {
                instrument.playBass(note!!)
            }

            is GuitarNote -> {
                instrument.playGuitar(note!!)
            }

            is VocalNote -> {
                instrument.singVocals(note!!)
            }

            is newNote -> {

            }
        }
    }
}