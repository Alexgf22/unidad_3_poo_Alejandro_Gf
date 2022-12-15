/**
 * La clase Coche cuenta con varios atributos y un metodo para cambiar el color del coche al que se le
 * pase por parametro. Tambien el metodo toString() para sacar por pantalla los atributos del coche.
 */
class Coche(
    var color: String,
    var marca: String,
    var modelo: String,
    var numero_caballos: Int,
    var numero_puertas: Int,
    private var matricula: String
)  {

    fun cambioColor(color: String): String {
        this.color = color
        return this.color
    }


    override fun toString(): String {
        return "El coche de color: $color, marca: $marca, modelo: $modelo, numero de caballos: $numero_caballos, numero de puertas $numero_puertas y matricula: $matricula "
    }




}

/**
 * Se crea varios objectos de coche. Después se hace una llamada al metodo de cambiar el color y se prueba
 * en varios coches, tambien se cambia el color asignando directamente un color nuevo al color que tenia antes.
 */
fun main()  {

    val coche1 = Coche("Azul","Renault","Captur",100,5,"1234 MBD")
    val coche2 = Coche("Rojo","Seat","Ibiza",90,5,"7683 LZX")
    val coche3 = Coche("Verde","Audi","Q5",150,5,"5738 KZS")
    val coche4 = Coche("Amarillo","Ford","Mustang",250,5,"8537 LMN")

    coche1.cambioColor("Lila")
    println("El coche1 cambia a color: ${coche1.color}")

    coche2.cambioColor("Negro")
    println("El coche2 cambia a color: ${coche2.color}")

    // También para cambiar de color se puede hacer así directamente
    coche3.color = "Celeste"
    println("El coche3 cambia a color: ${coche3.color}")

    println(coche1)
    println(coche2)
    println(coche3)
    println(coche4)
}