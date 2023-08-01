public class LivroTeste {

    public static void main(String[] args) {

        RegistroVendas venda = new RegistroVendas();
        LivroFisico meuLivro = new LivroFisico("O hobbit",9.99);
        meuLivro.setNome("O Hobbit");
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");
        // meuLivro.editora = "saraiva";

        Editora editora1 = new Editora();
        editora1.email = "saraiva@gmail.com.br";
        meuLivro.setEditora(editora1);

        //meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();
        venda.adicionar(meuLivro);

        LivroDigital livroFavorito = new LivroDigital("O código da vinci",9.99);
        livroFavorito.setNome("O Código Da Vinci");
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setMarcaDAgua("teste@teste");

        Editora editora2 = new Editora("editora saraiva");
        editora1.nome = "editora saraiva";
        editora1.email = "saraiva@gmail.com.br";
        livroFavorito.setEditora(editora2);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        //livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();
        venda.adicionar(livroFavorito);

        Vouchers cupons = new Vouchers();
        cupons.validar("etec8");
        cupons.exibir();
    }

}
