import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Ex2KtTest {

    @Test
    fun algoritmeEuclides() {
        var RESULT = 2
        assertEquals(org.example.algoritmeEuclides(6,4),RESULT)
        RESULT = 4
        assertEquals(org.example.algoritmeEuclides(16,36),RESULT)
        RESULT = 3
        assertEquals(org.example.algoritmeEuclides(72,51),RESULT)
    }
}