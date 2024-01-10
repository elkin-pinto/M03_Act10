import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Ex3KtTest {
    @Test
    fun multiplicacioMarciana () {
        var RESULT = 13
        assertEquals(multiplicacioMarciana(3,5),RESULT)
        RESULT = 15107
        assertEquals(multiplicacioMarciana(59,312),RESULT)
        RESULT = 24
        assertEquals(multiplicacioMarciana(24,1),RESULT)
    }
}