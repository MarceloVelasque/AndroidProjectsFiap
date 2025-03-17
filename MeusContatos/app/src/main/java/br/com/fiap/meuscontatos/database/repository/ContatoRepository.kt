package br.com.fiap.meuscontatos.database.repository

import android.content.Context
import br.com.fiap.meuscontatos.database.dao.ContatoDb
import br.com.fiap.meuscontatos.model.Contato

class ContatoRepository(context: Context) {

    var db = ContatoDb.getDatabase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.salvar(contato = contato)
    }

    fun atualizar(contato: Contato): Int{
        return db.atualizar(contato = contato)
    }

    fun excluir(contato: Contato): Int {
        return db.excluir(contato = contato)
    }

    fun buscarContatoPeloId(id: Long): Contato{
        return db.buscarContatoPeloId(id=id)
    }

    fun listarContatos(): List<Contato>{
        return db.listarContatos()
    }



}