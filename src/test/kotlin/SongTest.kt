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
}