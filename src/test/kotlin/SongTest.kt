import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SongTest {
    @Test
    internal fun `should print stanza 99`() {
        // GIVEN
        val bottles = Bottles()

        // WHEN
        val text = bottles.verse(99)

        // THEN
        assertThat(text).isEqualTo(
            """
                99 bottles of beer on the wall, 99 bottles of beer.
                Take one down and pass it around, 98 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print stanza 86`() {
        val bottles = Bottles()

        val text = bottles.verse(86)

        assertThat(text).isEqualTo(
            """
                86 bottles of beer on the wall, 86 bottles of beer.
                Take one down and pass it around, 85 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print stanza number 10`() {
        val bottles = Bottles()

        val text = bottles.verse(10)

        assertThat(text).isEqualTo(
            """
                10 bottles of beer on the wall, 10 bottles of beer.
                Take one down and pass it around, 9 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print stanza number 1`() {
        val bottles = Bottles()

        val text = bottles.verse(1)

        assertThat(text).isEqualTo(
            """
                1 bottle of beer on the wall, 1 bottle of beer.
                Take one down and pass it around, no more bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print the last stanza`() {
        val bottles = Bottles()

        val text = bottles.verse(0)

        assertThat(text).isEqualTo(
            """
                No more bottles of beer on the wall, no more bottles of beer.
                Go to the store and buy some more, 99 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print verse for 2`() {
        val bottles = Bottles()

        val text = bottles.verse(2)

        assertThat(text).isEqualTo(
            """
                2 bottles of beer on the wall, 2 bottles of beer.
                Take one down and pass it around, 1 bottle of beer on the wall.
            """.trimIndent()
        )
    }
}