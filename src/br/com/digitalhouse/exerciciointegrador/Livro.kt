package br.com.digitalhouse.exerciciointegrador

data class Livro(
        override var codigo: Int,
        override var titulo: String,
        override var preco: Double,
        override var qtdEstoque: Int,
        var autor: String,
        var anoLancamento: Int
) : Produto