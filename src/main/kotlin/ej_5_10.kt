open class Libro(
    var titulo: String,
    var autor: String,
    var numero_paginas: Int,
    var calificacion: Int

) {

    fun comprobarCalificacion(): Boolean {
        return calificacion in 0..10
    }

    override fun toString(): String {
        return "El titulo del libro es: $titulo, del autor: $autor, con: $numero_paginas paginas y calificacion: $calificacion"
    }

}


open class ConjuntoLibros(
    var libros: MutableList<Libro> = mutableListOf()

): Libro(titulo = "Psicologia Oscura", autor = "Steven Turner", numero_paginas = 204, calificacion = 7){

    fun añadirLibro(libroNuevo: Libro) {
        if(libroNuevo !in libros) {
            libros.add(libroNuevo)
        }
    }

    fun eliminarLibroPorTitulo(titulo: String) {
        this.titulo = titulo
        val libroAeliminar = Libro(titulo, autor, numero_paginas, calificacion)
        libros.remove(libroAeliminar)

    }

    fun eliminarLibroPorAutor(autor: String) {
        this.autor = autor
        val libroAeliminar2 = Libro(titulo, autor, numero_paginas, calificacion)
        libros.remove(libroAeliminar2)


    }

    fun libroMayorCalificacion(): Libro {

        libros.sortBy { calificacion }
        return libros[2]
    }

    fun libroMenorCalificacion() : Libro {
        libros.sortBy { calificacion }
        return libros[0]
    }

    override fun toString(): String {
        return "Los libros guardados son: $libros"
    }


}


fun main() {
    val primerLibro = Libro("El alquimista","Paulo Coelho",192,5)
    val segundoLibro = Libro("Charlie y la fabrica de chocolate","Roald Dahl",208,8)

    val conjuntoLibro1 = ConjuntoLibros(mutableListOf(primerLibro,segundoLibro))

    val tercerLibro = Libro("Un mundo feliz","ALDOUS HUXLEY",256,3)

    conjuntoLibro1.añadirLibro(tercerLibro)

    println(conjuntoLibro1.toString())

    println("El libro con mayor calificacion es: ${conjuntoLibro1.libroMayorCalificacion()}")
    println("El libro con menor calificacion es: ${conjuntoLibro1.libroMenorCalificacion()}")

    conjuntoLibro1.eliminarLibroPorTitulo("El alquimista")
    conjuntoLibro1.eliminarLibroPorAutor("Roald Dahl")
    conjuntoLibro1.eliminarLibroPorTitulo("Un mundo feliz")

    val otroLibro = Libro("Ulises","James Joyce",900,9)

    conjuntoLibro1.añadirLibro(otroLibro)

    println(conjuntoLibro1.toString())



}
