class Stanza {
    fun drink(numberOfBottles: Int): String {
        return  """
            $numberOfBottles bottles of beer on the wall, $numberOfBottles bottles of beer.
            Take one down and pass it around, ${numberOfBottles - 1} bottles of beer on the wall.
        """.trimIndent()
    }
}
