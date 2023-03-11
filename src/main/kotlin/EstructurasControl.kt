fun main (args: Array<String>) {
    // If ---------------------------------------------------------------------------------------
    val nombre = "Alberto"
    if (nombre.isNotEmpty()) {
        println("El largo de la cadena es $nombre.length")
    } else {
        println("Error")
    }

    // Evaluar una condición y almacenarla en una constante (principio de no inmutabilidad)
    val mensaje : String = if(nombre.isNotEmpty()) {
        "No tienes nombre"
    } else if (nombre.length > 5) {
        "Muy largo"
    } else {
        "muy corto"
    }

    println(mensaje);

    // When -------------------------------------------------------------------------------------
    val nombreColor = "Amarillo"

    when(nombreColor) {
        "Amarillo"       -> println("El amarillo es el color de la alegría")
        "Rojo","Carmesí" -> println("El rojo simboliza el calor")
        else             -> println("No es ninguno de los dos")
    }

    val code = 200
    when(code) {
        in 200..299 -> println("Todo funcionó correctamente")
    }
}