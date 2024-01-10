/**
 * Aquest és un conjunt de funcions per a operacions matemàtiques.
 * Creador: Omar
 * Data: 10/1/2024
 */
fun main() {

    /**
     * Calcula el factorial d'un nombre donat.
     * @param n El nombre d'entrada.
     * @return El factorial de [n].
     */
    fun m1_iterativo(n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    /**
     * Calcula la suma d'enters de 1 a n.
     * @param x Paràmetre no utilitzat.
     * @param n El límit superior per a la suma.
     * @return La suma d'enters de 1 a [n].
     */
    fun m2_iterativo(x: Double, n: Int): Int {
        var result = 0
        for (i in 1..n) {
            result += i
        }
        return result
    }

    /**
     * Calcula la suma d'enters de 2 a n-1.
     * @param n El límit superior per a la suma.
     * @return La suma d'enters de 2 a [n]-1.
     */
    fun m3_iterativo(n: Int): Int {
        var result = 0
        for (i in 2 until n) {
            result += i
        }
        return result
    }

    /**
     * Calcula la suma de dígits en un nombre donat.
     * @param n El nombre d'entrada.
     * @return La suma de dígits a [n].
     */
    fun m4_iterativo(n: Int): Int {
        var result = 0
        var tempN = n
        while (tempN != 0) {
            result += tempN % 10
            tempN /= 10
        }
        return result
    }
}
