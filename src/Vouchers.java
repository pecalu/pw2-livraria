import java.util.*;

public class Vouchers {
    Set<String> itens = new HashSet<>(); //set nao permite elementos duplicados e ordena em ordem para busca
                                        // list deixa em ordem que foi gerada 'desorganizada' e perimite iten duplicados

    public Vouchers(){
        itens.add("Etec-Teste");
        Random gerador = new Random();
        for (int i = 0 ; i < 20 ; i++){
            String chave = "Etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }

    void validar(String item){
        var result = itens.stream().filter(e -> item.equalsIgnoreCase(e)).findAny();//estrutura que permite manipular listas && conversao de objetos
        if (result.isPresent()){
            System.out.println("Cupom valido");
        } else {
            System.out.println("cupom invalido");
        }
    }

    void exibir(){
        itens.forEach(e -> System.out.println(e));
    }
}
