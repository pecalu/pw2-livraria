public class Livro {

    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;
    Editora editora;

    public Livro(String nome, double preco) {
        this.nome = nome; // this é a referencia aos atributos
        this.preco = preco;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + preco);
        System.out.println("Páginas: " + paginas);
        System.out.println("Autor: " + autor);
        if (temEditorra())
            System.out.println("Editora: " + editora.nome);

        System.out.println("-------");
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual);
    }

    boolean temEditorra(){
        if (editora == null)
            return false;
        else
            return true;
    }

}