import java.util.Scanner;
//Exercício 2
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite três notas:");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);
    }
}