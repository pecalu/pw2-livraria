public class RegistroVendas {
    private double total;

    public void adicionar (Livro livro){
        System.out.println("Livro adicionado: " + livro.getNome());
        livro.aplicarDesconto(10);
        total = total + livro.getPreco();
    }

    //public void adicionar (LivroDigital lf){
      //  System.out.println("Livro adicionado: " + lf.getNome());
        //lf.aplicarDesconto(10);
        //total = total + lf.getPreco();

}
