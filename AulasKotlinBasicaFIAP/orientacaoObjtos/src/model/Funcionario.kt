package model

class Funcionario: Pessoa() {

    var cargo : String = ""
    var salario : Double = 0.0


    override fun exibirDados(){
        println("Exibir nome: ${nome}")
        println("Exibir Peso: ${peso}")
        println("Exibir Altura: ${altura}")
        println("Exibir Data Nasc: ${dataNascimento}")
        println("Exibir cargo : ${cargo}")
        println("Exibir saláro: ${salario}")
    }


}