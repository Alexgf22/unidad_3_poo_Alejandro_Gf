class Tiempo(
    var hora: Int,
    var minuto: Int = 0,
    var segundo: Int = 0
) {

    /*constructor(hora: Int,minuto: Int): this(hora,minuto) {
        this.hora = hora
        this.minuto = minuto
    }

    constructor(hora: Int): this(hora) {
        this.hora = hora
    }*/



    override fun toString(): String {
        return "$hora h $minuto m $segundo s"
    }


}


fun main() {
    print("Introduce la hora: ")
    var hora = readln().toInt()

    print("Introduce los minutos: ")
    var minutos = readln().toInt()

    print("Introduce los segundos: ")
    var segundos = readln().toInt()

    var tiempo1 = Tiempo(hora,minutos,segundos)

    print(tiempo1.toString())

}