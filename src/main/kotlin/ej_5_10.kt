/**
 * Aqui creo la clase libro donde se comprueba la calificacion del libro que este en el rango correspondiente y
 * se llama al metodo toString para sacar por pantalla los atributos de la clase.
 */
open class Libro(
    var titulo: String,
    var autor: String,
    var numero_paginas: Int,
    var calificacion: Int

) {

    fun comprobarCalificacion(calificacionLibro: Int): Boolean {
        var resultado = false
        if(calificacionLibro in 0..10) {
           resultado = true
        }
        return resultado
    }

    override fun toString(): String {
        return "El titulo del libro es: $titulo, del autor: $autor, con: $numero_paginas paginas y calificacion: $calificacion"
    }

}

/**
 * Aquí creo la clase ConjuntoLibros donde incluye una lista con varios libros de tipo Libro y el numero de libros.
 * Después creamos un companion object para indicar que el total de los libros es de 3. Creamos un método llamado
 * añadirLibro para que pueda incluir en los libros algún libro mientras que no exceda el límite de 3. Otros
 * métodos para añadir libros por título o autor. Además de dos métodos para sacar el libro con la calificación
 * más alta y el libro con la calificación más baja y el método toString.
 */
open class ConjuntoLibros(
    //private val libros: Array<Libro?> = arrayOfNulls(3)
    var libros: MutableList<Libro> = mutableListOf(),
    private var numeroDeLibros: Int = 3

    ) {

    companion object {
        const val TOTAL_DE_LIBROS = 3

    }


    fun añadirLibro(libro: Libro): Int {
        if (TOTAL_DE_LIBROS != numeroDeLibros) {
            libros[numeroDeLibros] = libro
            numeroDeLibros++
        }
        return numeroDeLibros
    }

    /*
    fun añadirLibro(libroNuevo: Libro) {
        if(libroNuevo !in libros) {
            libros.add(libroNuevo)
        }
    }

     */

    fun eliminarLibroPorTitulo(tituloLibro: String): Boolean {
        for(libro in libros) {
            if(libro.titulo == tituloLibro) {
                libros.remove(libro)
            }
        }
        return true


    }

    fun eliminarLibroPorAutor(autorLibro: String): Boolean {
        for(libro in libros) {
            if(libro.autor == autorLibro) {
                libros.remove(libro)
            }
        }
        return true


    }

    fun libroMayorCalificacion(): Libro {
        var mayorCalificacion = 0
        var libroResultante = Libro("Harry Potter","J.K Rowling",256,8)
        for(libro in libros) {
            if(libro.calificacion > mayorCalificacion) {
                mayorCalificacion = libro.calificacion
                libroResultante = libro
            }
        }
        return libroResultante
    }

    fun libroMenorCalificacion() : Libro {
        var menorCalificacion = 10
        var libroResultante = Libro("El señor de los Anillos","J.R.R Tolkien",500,8)
        for(libro in libros) {
            if(libro.calificacion < menorCalificacion) {
                menorCalificacion = libro.calificacion
                libroResultante = libro
            }
        }
        return libroResultante
    }

    override fun toString(): String {
        return "Los libros guardados son: $libros"
    }




}


fun main() {
    val primerLibro = Libro("El alquimista","Paulo Coelho",192,9)
    val segundoLibro = Libro("Charlie y la fabrica de chocolate","Roald Dahl",208,7)
    val tercerLibro = Libro("Un mundo feliz","ALDOUS HUXLEY",256,8)

    val conjuntoLibro1 = ConjuntoLibros(mutableListOf(primerLibro,segundoLibro,tercerLibro))

    println(conjuntoLibro1)

    if (primerLibro.comprobarCalificacion(primerLibro.calificacion)) {
        println("La calificacion esta dentro del rango")
    }
    else {
        println("La calificacion no esta dentro del rango")
    }

    println("El libro con mayor calificacion es: ${conjuntoLibro1.libroMayorCalificacion()}")
    println("El libro con menor calificacion es: ${conjuntoLibro1.libroMenorCalificacion()}")

    /* Aquí la funcion de eliminar el libro por titulo no me funciona y esta hecha de la misma forma que
    * la de eliminar libro por autor */
    //conjuntoLibro1.eliminarLibroPorTitulo("El alquimista")
    conjuntoLibro1.eliminarLibroPorAutor("Roald Dahl")
    //conjuntoLibro1.eliminarLibroPorTitulo("Un mundo feliz")

    val otroLibro = Libro("Ulises","James Joyce",900,9)

    println(conjuntoLibro1.añadirLibro(otroLibro))

    println(conjuntoLibro1)



}
