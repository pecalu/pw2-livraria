import java.util.List;
import java.util.Random;

public class Vouchers {
    List<String> itens = new ArrayList<>();

    public Vouchers(){
        itens.add("Etec-Teste");
        Random gerador = new Random();
        for (int i = 0 ; i < 20 ; i++){
            String chave = "Etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }

    void validar(String item){
        if(itens.contains(item)){
            System.out.println("Cupom Valido");
        } else{
            System.out.println("Cupom Invalido");
        }
    }

}
