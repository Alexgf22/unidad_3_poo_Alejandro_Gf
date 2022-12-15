/**
 * A continuacion se crea la clase Tiempo donde hay varios atributos que son la hora, los minutos y los segundos.
 *
 * @constructor se crea un constructor secundario para que se pueda introducir hora y minutos y no sea necesario
 * los segundos que por defecto seria 0.
 *
 * @constructor se crea otro constructor mas donde se pide unicamente la hora. Los minutos y segundos se establecen
 * por defecto en 0.
 *
 * Despues se hace un override del metodo toString() para sacar por pantalla los atributos de la clase de la manera
 * que queramos.
 *
 */
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


/**
 * Pedimos por pantalla la hora, los minutos y los segundos. Si no se introduce los minutos o segundos, lo controlamos
 * para que se cambie por un 0.
 */
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