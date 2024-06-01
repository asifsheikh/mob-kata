class Bottles {
    fun verse(numberOfBottles: Int): String = when (numberOfBottles) {
        0 ->
            "No more bottles of beer on the wall, " +
                    "no more bottles of beer." + "\n" +
                    "Go to the store and buy some more, " +
                    "99 bottles of beer on the wall."
        else ->
            "$numberOfBottles ${container(numberOfBottles)} of beer on the wall, " +
                    "$numberOfBottles ${container(numberOfBottles)} of beer." + "\n" +
                    "Take ${pronoun(numberOfBottles)} down and pass it around, " +
                    "${quantity(numberOfBottles - 1)} ${container(numberOfBottles - 1)} of beer on the wall."
    }

    fun verses(high: Int, low: Int): String {
        var stringBuffer = ""
        for (i in high downTo low) {
            stringBuffer += verse(i) + "\n\n"
        }
        return stringBuffer.trim()
    }

    fun sing(): String = verses(99, 0)

    private fun container(number: Int): String = if (number == 1)
        "bottle"
    else "bottles"

    private fun pronoun(number: Int): String = if (number == 1)
        "it"
    else "one"

    private fun quantity(number: Int): String = if (number == 0)
        "no more"
    else number.toString()
}
