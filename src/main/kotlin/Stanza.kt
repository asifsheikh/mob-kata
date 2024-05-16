class Stanza {
    fun drink(i: Int): String {
        return  """
            $i bottles of beer on the wall, $i bottles of beer.
            Take one down and pass it around, ${i - 1} bottles of beer on the wall.
        """.trimIndent()
    }
}
