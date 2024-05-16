class Stanza {
    fun drink(numberOfBottles: Int): String {
        return when(numberOfBottles){
            1 -> """
                1 bottle of beer on the wall, 1 bottle of beer.
                Take one down and pass it around, no more bottles of beer on the wall.
            """.trimIndent()
            else -> """
                $numberOfBottles bottles of beer on the wall, $numberOfBottles bottles of beer.
                Take one down and pass it around, ${numberOfBottles-1} bottles of beer on the wall.
            """.trimIndent()
        }
    }
}
