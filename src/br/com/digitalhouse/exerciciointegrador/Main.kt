package br.com.digitalhouse.exerciciointegrador

fun main(){
    val euRobo = Livro(1,"Eu Robo", 5.0, 10, "Isaac Asimov", 1950)
    val livro2 = Livro(2,"Livro2", 10.5, 10, "AutorX", 2000)
    val livro3 = Livro(3,"Livro3", 6.0, 10, "AutorX", 2001)
    val livro4 = Livro(4,"Livro4", 9.4, 10, "AutorX", 2003)
    val fundacao = Livro(5,"Fundação", 5.0, 10, "AutorY", 1985)
    val segundaFundacao = Livro(6,"Segunda Fundação", 5.0, 10, "AutorY", 1986)
    val oImperio = Livro(7,"O Imperio", 5.0, 10, "AutorY", 1987)
    val colecao1 = ColecaoLivros(1,"Colecao1", 25.0, 3, mutableListOf(fundacao,segundaFundacao, oImperio))
    val colecao2 = ColecaoLivros(2,"Colecao2", 28.45, 1, mutableListOf(livro2,livro3, livro4))

    val biblioteca = Biblioteca(mutableListOf(euRobo, livro2, livro3, livro4), mutableListOf(colecao1, colecao2))

    println(biblioteca)

    biblioteca.cadastrarLivro(Livro(1, "Teste", 10.6, 2, "AutorW", 1955))
    biblioteca.cadastrarLivro(Livro(8, "Livro5", 15.1, 1, "AutorW", 1955))
    biblioteca.cadastrarLivro(Livro(9, "Livro6", 20.69, 1, "AutorW", 1956))
    biblioteca.cadastrarColecao(ColecaoLivros(2, "Coleção3", 35.0, 1, mutableListOf(
            Livro(8, "Livro5", 15.1, 1, "AutorW", 1955),
            Livro(9, "Livro6", 20.69, 1, "AutorW", 1956)
    )))

    biblioteca.consultarPorCodigo(1)
    biblioteca.consultarPorCodigo(2)
    biblioteca.consultarPorCodigo(3)
    biblioteca.consultarPorCodigo(6)
    biblioteca.consultarPorCodigo(7)

    biblioteca.efetuarVendaLivro(6)
    biblioteca.efetuarVendaLivro(8)
    biblioteca.efetuarVendaLivro(8)
}