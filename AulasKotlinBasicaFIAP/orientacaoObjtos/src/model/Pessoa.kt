package model

import java.time.LocalDate

open class Pessoa {
    // Propriedades/campo/atributo do objeto

    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000 ,5 ,10)
    var peso: Int = 0
    var altura: Double = 0.0

    constructor()


    open fun exibirDados(){
        println("Exibir nome: ${nome}")
        println("Exibir Peso: ${peso}")
        println("Exibir Altura: ${altura}")
        println("Exibir Data Nasc: ${dataNascimento}")
    }




}