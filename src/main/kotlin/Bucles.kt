fun main(args: Array<String>) {
    // While -------------------------------------------------
    var contador = 10
    while (contador-- > 0) {
       println("El valor de contador es $contador")
    }

    // Do While -------------------------------------------------
    do{
        println("Generando un número aleatorio")
        var aleatorio = (0..100).random()
        println("El número generado es $aleatorio")
    } while (aleatorio > 50)

    // For -------------------------------------------------------
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas) {
        println("Hoy voy a comer $fruta")
    }

    // ForEach-----------------------------------------------------------
    listaDeFrutas.forEach {
        fruta -> (println("Voy a comerme una fruta $fruta nueva"))
    }

    // Map ---------------------------------------------------------------
    val caracteresDeFruta = listaDeFrutas.map {
        fruta -> fruta.length
    }

    println(caracteresDeFruta)

    // Filter ------------------------------------------------------------
    val listaFiltrada = caracteresDeFruta.filter { carater -> carater > 5 }

    println(listaFiltrada)
}