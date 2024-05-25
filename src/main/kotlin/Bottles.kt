class Bottles {
    fun verse(numberOfBottles: Int): String = when (numberOfBottles) {
        1 -> """
            1 bottle of beer on the wall, 1 bottle of beer.
            Take one down and pass it around, no more bottles of beer on the wall.
        """.trimIndent()

        0 -> """
            No more bottles of beer on the wall, no more bottles of beer.
            Go to the store and buy some more, 99 bottles of beer on the wall.
        """.trimIndent()

        2 -> """
            2 bottles of beer on the wall, 2 bottles of beer.
            Take one down and pass it around, 1 bottle of beer on the wall.
        """.trimIndent()

        else -> """
            $numberOfBottles bottles of beer on the wall, $numberOfBottles bottles of beer.
            Take one down and pass it around, ${numberOfBottles - 1} bottles of beer on the wall.
        """.trimIndent()
    }

    fun verses(high: Int, low: Int): String {
        var stringBuffer = ""
        for (i in high downTo low) {
            stringBuffer += verse(i) + "\n\n"
        }
        return stringBuffer.trim()
    }

    fun sing(): String = verses(99,0)
}
