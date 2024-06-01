class Bottles {
    fun verse(numberOfBottles: Int): String = when (numberOfBottles) {
        0 ->
            "No more bottles of beer on the wall, " +
            "no more bottles of beer." + "\n" +
            "Go to the store and buy some more, " +
            "99 bottles of beer on the wall."
        1 ->
            "1 bottle of beer on the wall, " +
            "1 bottle of beer." + "\n" +
            "Take one down and pass it around, " +
            "no more bottles of beer on the wall."
        else ->
            "$numberOfBottles bottles of beer on the wall, " +
            "$numberOfBottles bottles of beer." + "\n" +
            "Take one down and pass it around, " +
            "${numberOfBottles - 1} ${container(numberOfBottles - 1)} of beer on the wall."

    }

    private fun container(number: Int): String = if (number == 1)
        "bottle"
    else "bottles"

    fun verses(high: Int, low: Int): String {
        var stringBuffer = ""
        for (i in high downTo low) {
            stringBuffer += verse(i) + "\n\n"
        }
        return stringBuffer.trim()
    }

    fun sing(): String = verses(99, 0)
}
