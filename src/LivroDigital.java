public class LivroDigital extends Livro{
    private String MarcaDAgua;

    public LivroDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    void aplicarDesconto(double percentual) {
        if (percentual > 0.15)
            System.out.println("desconto nao permitido");
        else
            super.aplicarDesconto(percentual);
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.printf("Marca d'agua: " + MarcaDAgua);
    }

    public String getMarcaDAgua() {
        return MarcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        MarcaDAgua = marcaDAgua;
    }
}
