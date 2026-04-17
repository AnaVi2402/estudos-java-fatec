import java.util.Scanner;
//Exercício 5
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para verificar se é um número ímpar ou par, digite um número inteiro: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        teclado.close();
    }
}