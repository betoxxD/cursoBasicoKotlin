// Variables que se generan en tiempo de compilación, son inmutables
const val PI = 3.1416

fun main(args: Array<String>) {
    // Variable de lectura/escritura
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    // Variable de solo lectura
    val nombre = "Alberto"
    println(nombre)

    println(PI)

    // Tipos de variables ------------------------------------------------------------
    val boolean : Boolean = true
    val numeroLargo : Long = 3000000000000000000
    val double : Double = 2.7182
    val flotante : Float = 1.3f

    val PrimerValor = 20
    val segundoValor = 10
    var tercerValor = PrimerValor.minus(segundoValor)
    println(tercerValor)
    tercerValor = PrimerValor - segundoValor
    println(tercerValor)

    val apellido = "Diosdado"
    val nombreCompleto = "$nombre $apellido"
    println(nombreCompleto)
}