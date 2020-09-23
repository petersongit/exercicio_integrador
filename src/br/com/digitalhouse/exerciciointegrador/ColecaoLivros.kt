package br.com.digitalhouse.exerciciointegrador

data class ColecaoLivros(
        override var codigo: Int,
        override var titulo: String,
        override var preco: Double
        var listaLivros: MutableList<Livros>
) : Produto