class Tiempo(
    var hora: Int,
    var minuto: Int,
    var segundo: Int
) {

    constructor(hora: Int,minuto: Int): this(hora,minuto,0) {
        //this.hora = hora
        this.minuto = minuto
    }

    constructor(hora: Int): this(hora,0,0) {
        //this.hora = hora
        this.minuto = minuto
        this.segundo = segundo
    }



    override fun toString(): String {
        return "$hora h $minuto m $segundo s"
    }


}


fun main() {
    print("Introduce la hora: ")
    val hora = readln().toInt()


    print("Introduce los minutos: ")
    val minutos = readln()
    var minutosAint = 0
    if(minutos != "") {
        minutosAint = minutos.toInt()
    }


    print("Introduce los segundos: ")
    val segundos = readln()
    var segundosAint = 0
    if(segundos != "") {
        segundosAint = segundos.toInt()
    }


    val tiempo1 = Tiempo(hora)
    val tiempo2 = Tiempo(hora,minutosAint)
    val tiempo3 = Tiempo(hora,minutosAint,segundosAint)

    println(tiempo1)
    println(tiempo2)
    println(tiempo3)

}