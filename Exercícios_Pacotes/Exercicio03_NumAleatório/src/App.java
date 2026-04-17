import Analista.Faixa1;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        int numero = gerador.nextInt((20-1)+1)+1;
        
        System.out.println("NÚMERO ALEATÓRIO: "+numero);

        Faixa1 f1 = new Faixa1();
        
        System.out.println(f1.metodo1(numero));
    }
}
