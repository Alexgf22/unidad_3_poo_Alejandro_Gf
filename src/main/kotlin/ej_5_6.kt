// Listo
/**
 * A continuacion se crea la clase Rectangulo, donde se calcula mediante varios metodos el area y
 * el perimetro del rectangulo. Ademas se hace un override del toString() para sacar por pantalla
 * el area y perimetro del rectangulo
 */
class Rectangulo(
    var base: Int = 0,
    var altura: Int = 0
) {



    fun area(): Int {
        var area_rectangulo = base * altura
        return area_rectangulo
    }


    fun perimetro(): Int {
        var perimetro_rectangulo = 2 * (base + altura)
        return perimetro_rectangulo
    }

    override fun toString(): String {
        return "El area del rectangulo es ${area()} y el perimetro es ${perimetro()}"
    }
}


fun main() {
    var rectangulo1 = Rectangulo(12,10)
    var rectangulo2 = Rectangulo(5,6)
    var rectangulo3 = Rectangulo(3,4)

    println(rectangulo1)
    println(rectangulo2)
    println(rectangulo3)


}