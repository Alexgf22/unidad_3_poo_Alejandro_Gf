class Cuenta(
    var numero_cuenta: String,
    private var saldo: Int

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


/*
class Persona(
    var dni = String

) {

    fun añadir_cuenta() {

    }

    fun comprobar_moroso() {

    }


}*/


fun main() {



}