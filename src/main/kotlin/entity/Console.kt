package entity

class Console {
    fun readInt(msg: String): Int {
        var retorno: Int? = null

        do {
            print(msg)
            val info = readlnOrNull()

            if (info.isNullOrBlank() || info.toIntOrNull() == null) {
                println("Valor inválido.")
                continue
            }

            retorno = info.toIntOrNull()
        } while (retorno == null || retorno < 0)

        return retorno
    }

    fun readString(str: String): String {
        var retorno: String? = null

        do {
            print(str)
            val tipo = readlnOrNull()
            val convite: Convite = Convite(tipo)
            val s = listOf("luxo", "comum", "premium")
            if (!convite.tipo.isNullOrBlank()) {
                s.forEach {
                    if (it == convite.tipo)
                        retorno = convite.tipo
                }
            } else {
                println("Valor inválido.")
                continue
            }
        } while (retorno == null)

        return retorno as String
    }
}