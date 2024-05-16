import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SongTest {
    @Test
    internal fun `should print first stanza`() {
        // GIVEN
        val stanza = Stanza()

        // WHEN
        val text = stanza.drink(99)

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
        val stanza = Stanza()

        val text = stanza.drink(86)

        assertThat(text).isEqualTo(
            """
                86 bottles of beer on the wall, 86 bottles of beer.
                Take one down and pass it around, 85 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print stanza number 10`() {
        val stanza = Stanza()

        val text = stanza.drink(10)

        assertThat(text).isEqualTo(
            """
                10 bottles of beer on the wall, 10 bottles of beer.
                Take one down and pass it around, 9 bottles of beer on the wall.
            """.trimIndent()
        )
    }

    @Test
    internal fun `should print stanza number from 1`() {
        val stanza = Stanza()

        val text = stanza.drink(1)

        assertThat(text).isEqualTo(
            """
                1 bottle of beer on the wall, 1 bottle of beer.
                Take one down and pass it around, no more bottles of beer on the wall.
            """.trimIndent()
        )
    }
}