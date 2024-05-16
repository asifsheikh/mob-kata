class Stanza {
    fun drink(numberOfBottles: Int): String {
        val bottlesLeft = if (numberOfBottles > 1) {
            numberOfBottles - 1
        } else {
            "no more"
        }

        val bottlesText = if (numberOfBottles > 1) {
            "$numberOfBottles bottles"
        } else {
            "$numberOfBottles bottle"
        }

        return  """
            $bottlesText of beer on the wall, $bottlesText of beer.
            Take one down and pass it around, $bottlesLeft bottles of beer on the wall.
        """.trimIndent()
    }
}
