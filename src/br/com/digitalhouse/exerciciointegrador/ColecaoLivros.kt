package br.com.digitalhouse.exerciciointegrador

data class ColecaoLivros(
        override var codigo: Int,
        override var titulo: String,
        override var preco: Double,
        override var qtdEstoque: Int,
        var listaLivros: MutableList<Livro>
) : Produto {

    override fun toString(): String {
        return "ColecaoLivros(codigo=$codigo, titulo='$titulo', preco=$preco, qtdEstoque=$qtdEstoque, listaLivros=$listaLivros)"
    }
}