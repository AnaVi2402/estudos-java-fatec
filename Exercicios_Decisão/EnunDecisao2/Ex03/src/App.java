import java.util.Scanner;
//Exercício 3
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int a = teclado.nextInt();
        System.out.println("Insira outro número inteiro:");
        int b = teclado.nextInt();
        System.out.println ("Insira mais um número inteiro:");
        int c = teclado.nextInt();
        if (a>b && b>c) {
            System.out.println ("A ordem crescente dos números digitados é: " + c + ", " + b + " e " + a);
        } else if (a>c && c>b) {
            System.out.println ("A ordem crescente dos números digitados é: " + b + ", " + c + " e " + a);
        } else if (b>a && a>c) {
            System.out.println ("A ordem crescente dos números digitados é: " + c + ", " + a + " e " + b);
        } else if (b>c && c>a) {
            System.out.println ("A ordem crescente dos números digitados é: " + a + ", " + c + " e " + b);
        } else if (c>a && a>b) {
            System.out.println ("A ordem crescente dos números digitados é: " + b + ", " + a + " e " + c);
        } else if (c>b && b>a) {
            System.out.println ("A ordem crescente dos números digitados é: " + a + ", " + b + ", " + c);
        }
        teclado.close();
    }
}