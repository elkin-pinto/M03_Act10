fun main() {
    fun m1_iterativo(n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    fun m2_iterativo(x: Double, n: Int): Int {
        var result = 0
        for (i in 1..n) {
            result += i
        }
        return result
    }

    fun m3_iterativo(n: Int): Int {
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
}

