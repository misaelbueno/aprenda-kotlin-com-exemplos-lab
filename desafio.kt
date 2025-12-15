// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(
    name: String
)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        if(inscritos.contains(usuario)) {
            println("${usuario.nome} já está matriculado.")
            return
        }

        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado com sucesso em ${nome}")
    }
}

fun main() {
    val c1 = ConteudoEducacional("Intro ao Kotlin", 30)
    val c2 = ConteudoEducacional("POO em Kotlin", 40)

    val formacaoKotlin = Formacao(
        nome = "Kotlin",
        conteudos = listOf(c1, c2),
    )

    // Usuários
    val user1 = Usuario("José", "jose@example.com")
    val user2 = Usuario("Maria", "maria@example.com")
}
