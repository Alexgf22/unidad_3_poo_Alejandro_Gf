import java.util.spi.CurrencyNameProvider

open class Cuenta(
    var numero_cuenta: String,
    var saldo: Int

) {

    fun consultar_saldo(): Int {
        return saldo
    }

    fun recibir_abonos(cantidadRecibida: Int): String {
        saldo += cantidadRecibida
        return "Has recibido: $cantidadRecibida € y ahora tu saldo es de $saldo"
    }

    fun realizar_pagos(cantidadPagar: Int): String {
        saldo -= cantidadPagar
        return "Has pagado: $cantidadPagar y ahora tu saldo es de $saldo"
    }


}



class Persona(
    var dni: String = "49788654G",
    private var cuentas: MutableList<Cuenta> = mutableListOf()

): Cuenta(numero_cuenta="ES1034734343", saldo =100 ) {

    var contadorCuentas = 0
    fun añadir_cuenta() {
        contadorCuentas += 1
        if(contadorCuentas <= 3) {
            var cuentaNueva = Cuenta(numero_cuenta,saldo)
            cuentas.add(cuentaNueva)
        }

    }

    fun comprobar_moroso(): String {
        for(cuenta in cuentas)  {
            if (cuenta.saldo < 0) {
                return "La persona es morosa"
            }
        }
    }

    override fun toString(): String {
        return "La persona con DNI $dni"
    }


}


fun main() {



}