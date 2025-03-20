package br.com.fiap.consultacep.service


import br.com.fiap.consultacep.model.Endereco
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    //viacep.com.br/ws/


    //BASE URL viacep.com.br/ws/01001000/json/
    @GET("{cep}/json/")
    fun getEnderecoByCep(@Path("cep") cep: String): retrofit2.Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUFCidade(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): retrofit2.Call<List<Endereco>>

}