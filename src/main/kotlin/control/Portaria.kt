package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val console: Console = Console()

    fun controle() {
        val convidadoBusiness = ConvidadoBusiness()

        val idade = console.readInt("Qual a sua idade? ")
        val convidado = Convidado(idade)

        if (!convidadoBusiness.validaIdade(convidado.idade)) {
            return println("Negado. Menor de idade não permitido.")
        }

        val tipoConvite = console.readString("Qual é o tipo de convite? ")
        convidado.tipo = tipoConvite

        if (!convidadoBusiness.tipoConvite(convidado.tipo!!)) {
            return println("Negado. Convite inválido.")
        }

        val codConvite = console.readString("Qual é o código de convite? ")
        convidado.cod = codConvite

        if (!convidadoBusiness.codConvite(convidado.tipo!!, convidado.cod!!)) {
            return println("Negado. Código do convite inválido.")
        }

        return println("Bem vindo. Seu convite ${convidado.tipo?.uppercase()} ${convidado.cod?.uppercase()} foi cadastrado com sucesso")
    }
}