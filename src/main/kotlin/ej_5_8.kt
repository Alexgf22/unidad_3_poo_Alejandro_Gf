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
    val minutos = readln().toInt()


    print("Introduce los segundos: ")
    val segundos = readln().toInt()


    val tiempo1 = Tiempo(hora)
    val tiempo2 = Tiempo(hora,minutos)
    val tiempo3 = Tiempo(hora,minutos,segundos)

    println(tiempo1.toString())
    println(tiempo2.toString())
    println(tiempo3.toString())

}