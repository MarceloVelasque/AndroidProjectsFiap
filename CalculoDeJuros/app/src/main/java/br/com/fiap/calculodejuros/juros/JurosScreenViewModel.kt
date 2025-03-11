package br.com.fiap.calculodejuros.juros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.calculodejuros.calculos.calcularJuros
import br.com.fiap.calculodejuros.calculos.calcularMontante

class JurosScreenViewModel : ViewModel() {
    private val _capital = MutableLiveData<String>() // Aqui estou criando uma variável privada que é uma instância de MutableLiveData capaz de armazenar e alterar um valor do tipo String.
    val capital: LiveData<String> = _capital // Aqui estou criando uma variável pública do tipo LiveData<String> que referencia _capital, permitindo observar seu valor, mas sem modificá-lo diretamente.
    //irá receber a variavel privada _capital, ela seria o acesso a nossa variavél privada

    private val _taxa = MutableLiveData<String>()
    val taxa: LiveData<String> = _taxa

    private val _tempo = MutableLiveData<String>()
    val tempo: LiveData<String> = _tempo

    private val _juros = MutableLiveData<Double>()
    val juros: LiveData<Double> = _juros

    private val _montante = MutableLiveData<Double>()
    val montante: LiveData<Double> = _montante

    // Funções que atualizam os valores das variáveis MutableLiveData com novos valores recebidos, como os passados a partir da tela JurosScreen.
    fun onCapitalChanged(novoCapital: String) {
        _capital.value = novoCapital
    }

    fun onTaxaChanged(novataxa: String) {
        _taxa.value = novataxa
    }

    fun onTempoChanged(novoTempo: String) {
        _tempo.value = novoTempo
    }

    // Calcula os juros com base nos valores atuais de capital, taxa e tempo, convertendo-os de String para Double, e atualiza o valor de _juros.
    fun calcularJurosViewModel(){
        _juros.value = calcularJuros(capital = _capital.value!!.toDouble(),
            taxa = _taxa.value!!.toDouble(),
            tempo = _tempo.value!!.toDouble())

    }
    // Calcula o montante com base nos valores atuais de capital e juros, convertendo-os de String e Double respectivamente, e atualiza o valor de _montante.
    fun calcularMontanteViewModel(){
        _montante.value = calcularMontante(
            capital = capital.value!!.toDouble(),
            juros = juros.value!!.toDouble()
        )
    }


}
