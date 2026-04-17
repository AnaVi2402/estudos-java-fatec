import java.util.Scanner;
//Exercício 1
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = teclado.nextInt();
        System.out.println ("Digite mais um número inteiro:");
        int num2 = teclado.nextInt();
        System.out.println ("Digite mais um número inteiro:");
        int num3 = teclado.nextInt();
        System.out.println ("Digite mais um número inteiro:");
        int num4 = teclado.nextInt();
        int soma = num1 + num2 + num3 + num4;
        System.out.println ("A soma dos números é: " + soma);
    }
}