import Vetor.CalcularMedia;
import Vetor.DiaMaisChuvoso;
import Vetor.DiaMenosChuvoso;
import Vetor.LeitorVetor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----CHUVA NA SEMANA-----");

        int [] vetor = LeitorVetor.lerVetor();
        int maisChuvoso = DiaMaisChuvoso.MaisChuvoso (vetor);
        int menosChuvoso = DiaMenosChuvoso.MenosChuvoso (vetor);
        Double media = CalcularMedia.Media (vetor);
        String posicaoMais = DiaMaisChuvoso.PosicaoMaisChuvoso(vetor);
        String posicaoMenos = DiaMenosChuvoso.PosicaoMenosChuvoso(vetor);
        
        System.out.println("A média de chuva na semana foi: " + media);
        System.out.println("\nO dia mais chuvoso da semana foi " + maisChuvoso + "mm e ocorreu na "+ posicaoMais);
        System.out.println("\nO dia menos chuvoso da semana foi " + menosChuvoso + "mm e ocorreu na "+ posicaoMenos);
    }
}
