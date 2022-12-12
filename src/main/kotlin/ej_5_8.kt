class Tiempo(
    var hora: Int,
    var minuto: Int,
    var segundo: Int
) {

    constructor(hora: Int,minuto: Int): this(hora,minuto,0) {
        this.hora = hora
        this.minuto = minuto
    }

    constructor(hora: Int): this(hora,0,0) {
        this.hora = hora
    }



    override fun toString(): String {
        return "$hora h $minuto m $segundo s"
    }


}


fun main() {
    print("Introduce la hora: ")
    var hora = readln().toInt()

    print("Introduce los minutos: ")
    var minutos = readln().toInt()

    /*if (minutos == "") {
        var minutosAentero = minutos.toInt()
        minutosAentero = 0
    }*/

    print("Introduce los segundos: ")
    var segundos = readln().toInt()

    /*if (segundos == "") {
        var segundosAentero = segundos.toInt()
        segundosAentero = 0
    }*/

    var tiempo1 = Tiempo(hora,minutos,segundos)

    print(tiempo1.toString())

}