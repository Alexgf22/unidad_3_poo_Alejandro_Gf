import Persona.Companion.comprobarMoroso

/**
 * Aquí creo la clase Cuenta donde creo los métodos de consultar saldo, recibir dinero y realizar pagos.
 * Hay varios atributos como el numero de cuenta y el saldo. Ademas se hace un override del metodo toString()
 * para sacar por pantalla los atributos en el formato que queramos.
 */
open class Cuenta(
    var numero_cuenta: String,
    var saldo: Int

) {


    fun consultarSaldo(): Int {
        return saldo
    }

    fun recibirAbonos(cantidadRecibida: Int): Int {
        saldo += cantidadRecibida
        return saldo
    }

    fun realizarPagos(cantidadPagar: Int): Int {
        saldo -= cantidadPagar
        return saldo
    }

    fun transferencia(
        cuentaEmisora: Cuenta,
        cuentaDestinataria: Cuenta,
        cantidadAtransferir: Int
    ) {
        cuentaEmisora.realizarPagos(cantidadAtransferir)
        cuentaDestinataria.recibirAbonos(cantidadAtransferir)

    }

    override fun toString(): String {
        return "La cuenta: $numero_cuenta con: $saldo euros de saldo"
    }


}


/**
 * Se crea la clase persona
 */
class Persona(
    var dni: String = "49788654G",
    val cuentas: Array<Cuenta?> = arrayOfNulls(3),
    private var numeroDeCuentas: Int = 0
    //private var cuentas: MutableList<Cuenta> = mutableListOf()

) {

    companion object {

        const val TOTAL_DE_CUENTAS = 3

        fun comprobarMoroso(persona: Persona): String {
            var resultado = ""
            for(cuenta in persona.cuentas)  {
                if (cuenta != null) {
                    resultado = if (cuenta.saldo < 0) {
                        "La persona es morosa"
                    } else {
                        "La persona no es morosa"
                    }
                }
            }
            return resultado
        }
    }

    /* Mejor forma para añadir una nueva cuenta con el uso de la variable TOTAL_DE_CUENTAS definida en
     el companion object
     */


    fun añadirCuenta(cuenta: Cuenta): Int {
        if (TOTAL_DE_CUENTAS != numeroDeCuentas) {
            cuentas[numeroDeCuentas] = cuenta
            numeroDeCuentas++
        }
        return numeroDeCuentas
    }


        override fun toString(): String {
            return "La persona con DNI $dni, tiene las siguientes cuentas bancarias ${cuentas.toList()}"
        }




    //var contadorCuentas = 0

        /*fun añadirCuenta(numero_cuenta_nuevo: String, saldo_nuevo: Int): String {
        var resultado = ""
        if(contadorCuentas == 0) {
            for (cuenta in cuentas) {
                contadorCuentas += 1
            }
        }
        contadorCuentas += 1
        if(contadorCuentas <= 3) {
            val cuentaNueva = Cuenta(numero_cuenta_nuevo,saldo_nuevo)
            cuentas.add(cuentaNueva)
        }
        else {
            resultado = "No se pueden crear mas de 3 cuentas por persona"
            return resultado
        }


        resultado = "La nueva cuenta: $numero_cuenta_nuevo, con: $saldo_nuevo euros"
        return resultado


    }*/

        /*fun comprobarMoroso(): String {
        var resultado = ""
        for(cuenta in cuentas)  {
            if (cuenta.saldo < 0) {
                resultado = "La persona es morosa"
            }
            else {
                resultado = "La persona no es morosa"
            }
        }
        return resultado
    }*/

    }





fun main() {
    val cuenta1 = Cuenta("ES10295625", 0)
    val cuenta2 = Cuenta("ES10347483", 700)
    val cuenta3 = Cuenta("ES10367478", 300)

    val persona1 = Persona("49765432", arrayOf(cuenta1, cuenta2,cuenta3), 3)

    cuenta1.recibirAbonos(1100)
    cuenta2.realizarPagos(750)

    //cuenta2.recibirAbonos(cuenta1.realizarPagos(300))
    cuenta1.transferencia(cuenta1,cuenta2,300)

    println("El saldo de la cuenta1 es ahora de: ${cuenta1.consultarSaldo()}")
    println("El saldo de la cuenta2 es ahora de: ${cuenta2.consultarSaldo()}")

    println(comprobarMoroso(persona1))


    val cuenta4 = Cuenta("ES10532977", 500)

    println(persona1.añadirCuenta(cuenta4))

    print(persona1)

}




/*val cuenta1 = Cuenta("ES10295625",0)
val cuenta2 = Cuenta("ES10347483",700)
val persona1 = Persona("53698124E", mutableListOf(cuenta1, cuenta2))

cuenta1.recibirAbonos(1100)
cuenta2.realizarPagos(750)


cuenta2.recibirAbonos(cuenta1.realizarPagos(300))
println("El saldo de la cuenta1 es ahora de: ${cuenta1.consultarSaldo()}")
println("El saldo de la cuenta2 es ahora de: ${cuenta2.consultarSaldo()}")
println(persona1.comprobarMoroso())

println(persona1.añadirCuenta("ES108582842",200))
println(persona1.añadirCuenta("ES105478854",400))
println(persona1)*/