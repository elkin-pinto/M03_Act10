import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class Ex1KtTest {

    @Test
    fun testM1Iterativo() {
        assertEquals(1, m1_iterativo(0))
        assertEquals(1, m1_iterativo(1))
        assertEquals(120, m1_iterativo(5))
        assertEquals(3628800, m1_iterativo(10))
    }

    @Test
    fun testM2Iterativo() {
        assertEquals(0, m2_iterativo(0.0, 0))
        assertEquals(1, m2_iterativo(1.0, 1))
        assertEquals(15, m2_iterativo(3.0, 5))
    }

    @Test
    fun testM3Iterativo() {
        val result = m3_iterativo(10)
        assertEquals(44, result)
    }

    @Test
    fun testM4Iterativo() {
        val result = m4_iterativo(123)
        assertEquals(6, result)
    }
}


// Funciones a testear
    private fun m1_iterativo(n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    private fun m2_iterativo(x: Double, n: Int): Int {
        var result = 0
        for (i in 1..n) {
            result += i
        }
        return result
    }

    private fun m3_iterativo(n: Int): Int {
        var result = 0
        for (i in 2 until n) {
            result += i
        }
        return result
    }

fun m4_iterativo(n: Int): Int {
    var result = 0
    var tempN = n
    while (tempN != 0) {
        result += tempN % 10
        tempN /= 10
    }
    return result
}
