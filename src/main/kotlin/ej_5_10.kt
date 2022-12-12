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
        return "El libro de titulo: $titulo, autor: $autor, con: $numero_paginas paginas y calificacion: $calificacion"
    }

}


open class ConjuntoLibros(
    var libros: MutableList<Libro> = mutableListOf()

): Libro(titulo = "Psicologia Oscura","Steven Turner", numero_paginas = 204, calificacion = 7){

    fun añadirLibro(tituloDelLibro: String,autorDelLibro: String,numeroDePags: Int,laCalificacion: Int) {
        var libroNuevo = Libro(tituloDelLibro,autorDelLibro,numeroDePags,laCalificacion)
        if(libroNuevo !in libros) {
            libros.add(libroNuevo)
        }
    }

    fun eliminarLibroPorTitulo(titulo: String) {
        this.titulo = titulo
        var libroAeliminar = Libro(titulo, autor, numero_paginas, calificacion)
        libros.remove(libroAeliminar)

    }

    fun eliminarLibroPorAutor(autor: String) {
        this.autor = autor
        var libroAeliminar2 = Libro(titulo, autor, numero_paginas, calificacion)
        libros.remove(libroAeliminar2)


    }


}


fun main() {
    var primer_libro = Libro("El alquimista","Paulo Coelho",192,7)
    var segundo_libro = Libro("Charlie y la fábrica de chocolate","Roald Dahl",208,8)

    var conjuntoLibro1 = ConjuntoLibros(mutableListOf(primer_libro,segundo_libro))


}
