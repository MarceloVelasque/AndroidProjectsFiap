fun main() {
    println("VARIAVEIS AULA BASICA")

    var nomeFaculdade = "fiap"
    println(nomeFaculdade)
    nomeFaculdade = "nova atualizão"
    println(nomeFaculdade)
    var idade: Byte = 19 //passando o tipo da variavel
    var nome = "Marcelo Velasque"
    val pi = 3.14 //constante
    var cidade = "Joaçaba"
    println("a cidade é " + cidade)
    var text = "Este testo \" quebra\" em \n duas linhas"
    println(text)
    var text2 = "Nota:\t 10"
    println(text2)
    println("---------------------------------------------------------------------------------------------------")
    val studentGrade = 8.5
    val studentName = "Marcelo Velasque"
    val result = "Aprovado"
    val message = "O aluno $studentName tirou $studentGrade e está $result"
    println(message)
    println("---------------------------------------------------------------------------------------------------")


    var tipoChar = 'X'// declarando um char
    var (codigo, descricao) = Pair(100, "Mouse") // declarando um Pair
    println(codigo)
    println(descricao)
    var produto2: Pair<Int, String> = Pair(200, "Teclado") // outra forma de criar um pair
    println(produto2.first)
    println(produto2.second)

    println("-------------------------------------------------------------------------")

    println("VALORES BOOLEAN")
    var isApprovad = true
    var firstTime: Boolean = false

    println("-------------------------------------------------------------------------")

    println("Tipo NULL SAFETY") // aqui eu consigo atribuir um valor nullo usando o ? na frente do tipo da variavel
    var idade2: Int? = null
    println(idade)
    println("-------------------------------------------------------------------------")

    println("COLEÇÕES EM KOTLIN")

    println("Array")
    var cidades = arrayOf("São Paulo", "Rio de Janeiro", "Curitiba")
    /*  println(cidades[1])
    cidades[2] = "Florianopolis "
    println(cidades)*/
    var temCidade = cidades.isEmpty()
    println(" está vazia contéudo dentro desse array? " + temCidade)

    println("O tamanho é " + cidades.size)
    println("-------------------------------------------------------------------------")
    println("ARRAYLIST MANIPULAR COLEÇÕES")

    var frutas = ArrayList<String>()
    println("Frutas " + frutas.size)
//adicionar um novo elemento no arrayList
    frutas.add("Banana")
    frutas.add("Melancia")
    frutas.add("Morango")
    frutas.add("Manga")
    println("Frutas " + frutas.size)

    println(frutas.contains("Uva"))
    println(frutas.contains("Manga"))
    // ver toda a lista
    println(frutas)

    //remover um elemento do ArrayList
    frutas.remove("Banana")
    println(frutas)

    var emptyArray = arrayOf<String>()
    var shoppingList = arrayOf<String>("leite", "Pão", "Manteiga", "Açucar")
    var inferredShoppingList = arrayOf("Leite", "Pão", "Manteiga", "Açúcar")

    if (shoppingList.isEmpty()) {
        println("A lista de compras está vazia")
    } else {
        println("A lista de compras Não está vazia")
    }

    //Recuperando o Total de elementos do Array
    println("Nossa Lista de compras possui ${shoppingList.size} itens")
    //listar os itens do array
    println(shoppingList[0])
    println(shoppingList[1])
    println(shoppingList[2])
    println(shoppingList[3])


    println("-------------------------------------------------------------------------")

    println("COLEÇÕES SET E MAP")

    var filmes = HashSet<String>()
    println(filmes.size)

    filmes.add("Homem Arrahnha")
    filmes.add("Senhor dos Aneis")
    filmes.add("Super Mario World")

    println(filmes)
    println("-------------------------------------------------------------------------")

    println("OPERADORES EM KOTLIN")

    //MESMO DO JAVA
    println("-------------------------------------------------------------------------")


    println("ESTRUTURAS CONDICIONAIS")

    var idade3 = 21

    if (idade3 >= 18) {
        println("" + idade2 + "você é maior de idade")
    } else {
        println("você é menor de idade sua idade é " + idade3)
    }

    var cor = "azul"

    if (cor == "vermelho") {
        println("Você escolheu VERMELHO")
    } else if (cor == "azul") {
        println("Você escolheu AZUL")
    } else {
        println("opção invalida")
    }
    //-----------------------
    // exemplos com when
    var numero = 10

    when (numero % 2) {
        0 -> println(" O número $numero é PAR!")
        else -> println(" O número $numero é IMPAR")
    }


    var letra = "z"
    when (letra) {
        "a", "e", "i", "o", "u" -> println("VOGAL")
        else -> println("CONSOANTE")
    }

    println("-------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------")

    println("ENUMERADOR")

    val tipoDaConta = TipoConta.CORRENTE

    println(tipoDaConta.nomeConta)

    println("-------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------")

    println("FUNÇÕES")

    var a = 10
    var b = 20


    fun somar1(valor1: Int, valor2: Int) {
        println("A soma  $valor1 + $valor2 ")


    }
    somar1(a, b)

    fun saudar() {
        println("olá galeraaaa")
    }

    saudar()
    fun subtrair(valor12: Int, valor42: Int): Int {
        return valor12 - valor42

    }

    var x = subtrair(5, 5)

    println(x)

    fun dividir(valor3: Int, valor4: Int) = valor3 / valor4


    var divide = dividir(100, 200)
    println(divide)

//------------------------------------------------------------
//MAP, FILTER E REDUCE

    //FILTER
var numer = listOf(1,2,3,4,5, 6,7,9,10)
    var pares = numer.filter {
        it % 2 == 0
    }

    println(pares)


    var frutinhas = listOf("uva", "abacaxi", "morango", "laranja")

    var pesqFrutas = frutinhas.filter {
        it.startsWith("m")
    }

// MAP
    var frutasMais = frutinhas.map {
        it.uppercase()
    }






}
enum class TipoConta(var nomeConta: String ){
    CORRENTE("Corrente"), POUPANCA("Poupança"),SALARIO("Salário")