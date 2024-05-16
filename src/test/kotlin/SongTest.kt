import com.google.common.truth.Truth
import org.junit.jupiter.api.Test

class SongTest {
    @Test
    internal fun `should print first stanza`() {
        val stanza = Stanza()
        val text = stanza.drink(99)
        Truth.assertThat(text).isEqualTo(
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
        Truth.assertThat(text).isEqualTo(
            """
                86 bottles of beer on the wall, 86 bottles of beer.
                Take one down and pass it around, 85 bottles of beer on the wall.
            """.trimIndent()
        )
    }
}