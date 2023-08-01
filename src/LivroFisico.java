public class LivroFisico extends Livro{
    public LivroFisico(String nome, double preco) {
        super(nome, preco);
    }

    public double getTaxaImpressao(){
        return preco * 0.05;
    }


}

