import Vetor.CalcularMedia;
import Vetor.MaiorNum;
import Vetor.MenorNum;
import Vetor.leitorVetor;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("----Temperatura da semana----");
        double[] vetor = leitorVetor.lerVetor();
        double maior = MaiorNum.Maior(vetor);
        double menor = MenorNum.Menor(vetor);
        double media = CalcularMedia.media(vetor);
        String posicaoMaior = MaiorNum.PosicaoMaior(vetor);
        String posicaoMenor = MenorNum.PosicaoMenor(vetor);


        System.out.println("A média das temperaturas semanais é: " + df.format(media));
        System.out.println("\nA maior temperatura da semana foi " + df.format(maior) + " e ocorreu na "+ posicaoMaior);
        System.out.println("\nA menor temperatura da semana foi " + df.format(menor) + " e ocorreu na "+ posicaoMenor);
    }
}
