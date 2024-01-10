import java.util.*

/**
 * La funcion main se encarga de ser la funcion principal y de juntar las diversas funciones
 *
 * @see leerNumeroNatural se asegura que el numero introducido sea un numero natural
 * @see multiplicacioMarciana multiplica dos numeros de la forma marciana
 */
fun main() {
    val scan = Scanner(System.`in`)
    val numero1 = leerNumeroNatural(scan,"Ese no es un numero natural, prueba otra vez: ")
    val numero2 = leerNumeroNatural(scan,"Ese no es un numero natural, prueba otra vez: ")

    print(multiplicacioMarciana(numero1,numero2))
}


/**
 * Esta funcion lo que hace és hacer un multiplicacion marciana
 *
 * @param n1 un numero natura pasado por el usuario
 * @param n2 un numero natural pasado por el usuario
 */
fun multiplicacioMarciana (n1:Int, n2:Int):Int {
    if (n2 != 1) {
        val numero1 = n1 shl 1
        val numero2 = n2 shr 1
        return if (numero2 != 1) {
            var resultado = multiplicacioMarciana(numero1, numero2)
            if (n2 % 2 == 1) {
                resultado += 1
            }
            resultado
        } else numero1

    }
    return n1
}

