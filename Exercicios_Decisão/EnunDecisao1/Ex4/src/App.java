import java.util.Scanner;
//Exercício 4
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        teclado.close();
    }
}
