public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O hobbit",9.99);
        meuLivro.setNome("O Hobbit");
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");
        // meuLivro.editora = "saraiva";

        Editora editora1 = new Editora();
        editora1.email = "saraiva@gmail.com.br";
        meuLivro.setEditora(editora1);

        meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O código da vinci",9.99);
        livroFavorito.setNome("O Código Da Vinci");
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        Editora editora2 = new Editora("editora saraiva");
        editora1.nome = "editora saraiva";
        editora1.email = "saraiva@gmail.com.br";
        livroFavorito.setEditora(editora2);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
