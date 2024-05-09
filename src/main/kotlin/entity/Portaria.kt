package entity

class Portaria {

    private val console: Console = Console()

    fun controle() {
        val idade = console.readInt("Qual a sua idade? ")

        if (idade < 18) return println("Negado. Menor de idade não permitido.")

        val tipo = console.readString("Qual é o tipo de convite? ")

        return println(tipo)
    }
}