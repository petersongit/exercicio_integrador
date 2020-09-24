package br.com.digitalhouse.exerciciointegrador

class Biblioteca {
    var listaLivros: MutableList<Livro>
    var listaColecoes: MutableList<ColecaoLivros>

    constructor(listaLivros: MutableList<Livro>, listaColecoes: MutableList<ColecaoLivros>) {
        this.listaLivros = listaLivros
        this.listaColecoes = listaColecoes
    }

    override fun toString(): String {
        return "Biblioteca(listaLivros=$listaLivros, listaColecoes=$listaColecoes)"
    }

    fun cadastrarLivro(novoLivro: Livro): Boolean {

        listaLivros.forEach {
            when (it.codigo) {
                novoLivro.codigo -> return false
            }
        }

        listaLivros.add(novoLivro)
        return true
    }

    fun cadastrarColecao(novaColecao: ColecaoLivros): Boolean {
        listaColecoes.forEach {
            when (it.codigo) {
                novaColecao.codigo -> return false
            }
        }

        listaColecoes.add(novaColecao)
        return true
    }

    fun consultarPorCodigo(codigoLivro: Int) {}

    fun efetuarVendaLivro(codigoLivro: Int) {}

    fun efetuarVendaColecao(codigoColecao: Int) {}
}