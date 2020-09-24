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

    fun consultarPorCodigo(codigoLivro: Int) {
        listaColecoes.forEach {
            when (it.codigo) {
                codigoLivro -> println(it)
                else ->  print("Código $codigoLivro não encontrado na coleção")
            }
        }

        listaLivros.forEach {
            when (it.codigo) {
                codigoLivro -> println(it)
                else -> print("Código $codigoLivro não encontrado")
            }
        }

    }



    fun efetuarVendaLivro(codigoLivro: Int) {
        listaLivros.forEach {
            when  {
                it.qtdEstoque >  0 -> {
                    print("Venda do livro ${it.titulo} efetuada com sucesso")
                    it.qtdEstoque--
                }
                else -> println("O livro ${it.titulo} não tem mais em nosso estoque")
            }
        }
    }

    fun efetuarVendaColecao(codigoColecao: Int) {
        listaColecoes.forEach {
            when  {
                it.qtdEstoque >  0 -> {
                    print("Venda do livro ${it.titulo} efetuada com sucesso")
                    it.qtdEstoque--
                }
                else -> println("A coleção ${it.titulo} não tem mais em nosso estoque")
            }
        }
    }

}