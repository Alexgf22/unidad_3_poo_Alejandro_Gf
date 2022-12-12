/**
 * Aquí creo la clase Cuenta donde creo los métodos de consultar saldo, recibir dinero y demás
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
        return cantidadRecibida
    }

    fun realizarPagos(cantidadPagar: Int): Int {
        saldo -= cantidadPagar
        return cantidadPagar
    }

    override fun toString(): String {
        return "La cuenta: $numero_cuenta con: $saldo euros de saldo"
    }


}



class Persona(
    var dni: String = "49788654G",
    private var cuentas: MutableList<Cuenta> = mutableListOf()

) {

    var contadorCuentas = 0

    fun añadirCuenta(numero_cuenta_nuevo: String, saldo_nuevo: Int): String {
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

    }

    fun comprobarMoroso(): String {
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
    }

    override fun toString(): String {
        return "La persona con DNI $dni, tiene las siguientes cuentas bancarias $cuentas"
    }


}


fun main() {
    val cuenta1 = Cuenta("ES10295625",0)
    val cuenta2 = Cuenta("ES10347483",700)
    val persona1 = Persona("53698124E", mutableListOf(cuenta1,cuenta2))

    cuenta1.recibirAbonos(1100)
    cuenta2.realizarPagos(750)


    cuenta2.recibirAbonos(cuenta1.realizarPagos(300))
    println("El saldo de la cuenta1 es ahora de: ${cuenta1.consultarSaldo()}")
    println("El saldo de la cuenta2 es ahora de: ${cuenta2.consultarSaldo()}")
    println(persona1.comprobarMoroso())

    println(persona1.añadirCuenta("ES108582842",200))
    println(persona1.añadirCuenta("ES105478854",400))
    println(persona1)
}