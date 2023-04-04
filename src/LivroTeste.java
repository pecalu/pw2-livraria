public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O hobbit",9.99);
        meuLivro.nome = "O Hobbit";
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora = new Editora();
        editora.nome = "Editora Saraiva";
        editora.email = "saraiva@gmail.com.br";
        meuLivro.editora = editora;

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O código da vinci",9.99);
        livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";
        livroFavorito.editora = editora;

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
