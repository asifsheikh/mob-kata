class Bottles {
    fun verse(numberOfBottles: Int): String =
        "${quantity(numberOfBottles).capitalize()} ${container(numberOfBottles)} of beer on the wall, " +
                "${quantity(numberOfBottles)} ${container(numberOfBottles)} of beer." + "\n" +
                "${action(numberOfBottles)}, " +
                "${quantity(successor(numberOfBottles))} ${container(numberOfBottles - 1)} of beer on the wall."

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

    private fun action(number: Int): String = if (number == 0)
        "Go to the store and buy some more"
    else "Take ${pronoun(number)} down and pass it around"

    private fun successor(number: Int): Int = if (number == 0) 99
    else number - 1
}
