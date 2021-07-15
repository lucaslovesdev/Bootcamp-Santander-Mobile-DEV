package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas de "
    var cpf: String = "123.456.789-10"
}

fun main() {
    val lucas = Pessoa()

    println(lucas.nome)
    println(lucas.cpf)
}