package business

import interfaces.TiposValidos

class ConvidadoBusiness : TiposValidos {
    override val tipos: List<String> = listOf("comum", "premium", "luxo")

    fun validaIdade(age: Int): Boolean = age > 17

    fun tipoConvite(tipo: String): Boolean = tipos.contains(tipo)

    fun codConvite(tipo: String, cod: String): Boolean = when (tipo) {
        tipos[0] -> cod.startsWith("xt")
        tipos[1], tipos[2] -> cod.startsWith("xl")
        else -> {
            false
        }
    }
}
//        return tipo == tipos[0] && cod.startsWith("xt") || cod.startsWith("xl") && tipo != tipos[0]
