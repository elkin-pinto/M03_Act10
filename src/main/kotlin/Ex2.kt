import java.util.*

/**
 * @author David Pinto
 * @version 1.9.10
 *
 * El main es la funcion principal del programa, donde se llama al resto de funciones
 *
 * @see leerNumeroNatural se asegura que el numero introducido sea un numero natural
 * @see algoritmeEuclides recive dos numero s naturales y retorna el maximo comun divisor
 */
fun main() {
    val scan = Scanner(System.`in`)
    println("Di un numero natural positivo")
    val n1 = leerNumeroNatural(scan, "Ese no es un numero natural, preuba otra vez: ")
    println("Di un numero natural positivo")
    val n2 = leerNumeroNatural(scan, "Ese no es un numero natural, preuba otra vez: ")

    val maximoComunDivisor = algoritmeEuclides(n1, n2)

    println(maximoComunDivisor)
}

/**
 * Hace le algoritmo de Euclides para poder calcular el maximo comun divisor de dos numeros naturales
 *
 * @param n1 es un input de un usuario
 * @param n2 es un input de un usuario
 *
 * @return retorna en última instancia un Int que es el maximo comun divisor.
 */
fun algoritmeEuclides(n1:Int,n2:Int):Int {
    var numero1 = n1
    var result:Int = n1
    var numero2 = n2
    if (numero2 < numero1) {
        numero1 -= numero2
        result = algoritmeEuclides(numero1, numero2)
    }
    else if (numero1 < numero2) {
        numero2 -= numero1
        result = algoritmeEuclides(numero1, numero2)
    }

    return result
}

/**
 * Se asegura que el input del usuario sea un numero natural
 *
 * @param scan un scanner
 * @param err mensaje de error
 *
 * @return retorna un Int
 */
fun leerNumeroNatural(scan:Scanner, err:String):Int {
    var input: Int
    do {
        while (!scan.hasNextInt()) {
            scan.nextLine()
            println(err)
        }
        input = scan.nextInt()
        if (input < 1) println(err)
    } while(input < 1)

    return input
}