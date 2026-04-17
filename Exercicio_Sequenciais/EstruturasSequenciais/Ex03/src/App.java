import java.text.DecimalFormat;
import java.util.Scanner;
//Exercício 3
public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número da primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println ("Digite o peso da primeira nota: ");
        double peso1 = teclado.nextDouble();
        System.out.println("Digite o número da segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println ("Digite o peso da segunda nota: ");
        double peso2 = teclado.nextDouble();
        System.out.println("Digite o número da terceira nota: ");
        double nota3 = teclado.nextDouble();
        System.out.println ("Digite o peso da terceira nota: ");
        double peso3 = teclado.nextDouble();
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média ponderada é: " + df.format(media));

        teclado.close();
    }
}