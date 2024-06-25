package solid.srp

data class SheetMusic(val notes: List<Note>)

interface Instrument {
    fun playNote(note: Note)
    fun perform(score: SheetMusic)
}

class GuitarInstrument : Instrument {
    override fun playNote(note: Note) {
       if(note is Note.GuitarNote){
           // do something
       }

       val guitarNote = note as? Note.GuitarNote ?: return
    }

    override fun perform(score: SheetMusic) {
        TODO("Not yet implemented")
    }
}

class PianoInstrument : Instrument {
    override fun playNote(note: Note) {
        TODO("Not yet implemented")
    }

    override fun perform(score: SheetMusic) {
        TODO("Not yet implemented")
    }
}

class VocalsInstrument : Instrument {
    override fun playNote(note: Note) {
        TODO("Not yet implemented")
    }

    override fun perform(score: SheetMusic) {
        TODO("Not yet implemented")
    }
}