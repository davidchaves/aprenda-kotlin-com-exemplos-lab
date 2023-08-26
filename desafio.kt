// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVACADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario: ${usuario.hashCode()} matriculado na formacao: $nome.")
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    val formacao = Formacao(
    	nome = "Formaçao em Java", 
        conteudos = listOf(
        	ConteudoEducacional(nome = "Introdução ao Java"),
            ConteudoEducacional(nome = "OO"),
            ConteudoEducacional(nome = "Programaçao funcional")
        )
    )
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}