class Coche(
    var color: String,
    var marca: String,
    var modelo: String,
    var numero_caballos: Int,
    var numero_puertas: Int,
    var matricula: String
)  {

    fun cambioColor(color: String): Boolean {
        this.color = color
        return true
    }


    override fun toString(): String {
        return super.toString()
    }




}


fun main()  {

    var coche1 = Coche("Azul","Renault","Captur",100,5,"1234 MBD")
    var coche2 = Coche("Rojo","Seat","Ibiza",90,5,"7683 LZX")
    var coche3 = Coche("Verde","Audi","Q5",150,5,"5738 KZS")
    var coche4 = Coche("Amarillo","Ford","Mustang",250,5,"8537 LMN")

    coche1.cambioColor("Lila")
    print(coche1.color)
}