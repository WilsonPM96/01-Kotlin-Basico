import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hola, Mundo!")   //System.out
    println(sumarDosNumeros(4, 7)) //devuelve la suma de los numeros
    var nombre: String? = "Wilson" //variable que cambia
    var edad = 21
    val edadActual = 21
    var casado = false
    casado = true //duck Typing


    when (casado) {
        true -> {
            println("Esta casado")
        }
        else -> {
            println("No esta casado")
        }
    }
    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }
    println("Superheroe: ${superHeroe}") //template Strings

    var wilson = Persona(Integer(21), "Wilson")
    println(wilson.toString())
    var wilson2 = PersonaDos(Integer(21), "Wilson")
    println(wilson2.toString())
    var wilson3= PersonaTres(Integer(21), "Wilson")
    println(wilson3.toString())
}

class Persona {
    lateinit var edadActual: Integer       //lateinit inicializar luego
    lateinit var nNombre: String

    //ctrl +a
    //ctrl + alt + l
    constructor(edad: Integer, nombre: String) {
        edadActual = edad
        nNombre= nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }
    override fun toString() : String {
        return "La edad actual para la persona 1 es $edadActual y el nombre es $nNombre"
    }
}

class PersonaDos(edad: Integer, nombre: String) {
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null
    var nCasado: Boolean = true

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        nCedula = cedula
    }

    constructor(edad2: Integer, nombre2: String, cedula2: String, casado1: Boolean) : this(edad2, nombre2) {
        nCedula = cedula2
        nCasado = casado1
    }
    override fun toString() : String {
        return "La edad actual de la persona dos es $nEdad y el nombre es $nNombre y su estatus es $nCasado"
    }
}

class PersonaTres(edad: Integer, nombre: String) {
    lateinit var nEdad: Integer
    var nNombre = nombre

    init {   //escribir codigo despues del constructor
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }
    override fun toString() : String {
        return "La edad actual de la persona 3 es $nEdad y el nombre es $nNombre"
    }

}

open class Figura(nombre: String) {
    val Nnombre = nombre
}

class Cuadrado(nombre: String, valorlado: Integer) : Figura(nombre) {
    var valorLado = valorlado

}