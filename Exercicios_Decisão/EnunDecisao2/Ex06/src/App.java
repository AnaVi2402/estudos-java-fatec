import java.util.Scanner;
//Exercício 6
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int I = teclado.nextInt();
        System.out.println("Digite mais 3 números reais, diferentes entre si:");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        switch (I) {
            case 1:
                if (A>B && B>C){
                    System.out.println("A ordem crescente dos números é: " + C + ", " + B + ", " + A);
                } else if (A>C && C>B){
                    System.out.println("A ordem crescente dos números é: " + B + ", " + C + ", " + A);
                } else if (B>A && A>C){
                System.out.println("A ordem crescente dos números é: " + C + ", " + A + ", " + B);
                } else if (B>C && C>A){
                System.out.println("A ordem crescente dos números é: " + A + ", " + C + ", " + B);
                } else if (C>A && A>B){
                System.out.println("A ordem crescente dos números é: " + B + ", " + A + ", " + C);
                } else {
                System.out.println("A ordem crescente dos números é: " + A + ", " + B + ", " + C);
                }
            break;
            case 2:
                if (A>B && B>C){
                    System.out.println("A ordem decrescente dos números é: " + A + ", " + B + ", " + C);
                } else if (A>C && C>B){
                    System.out.println("A ordem decrescente dos números é: " + A + ", " + C + ", " + B);
                } else if (B>A && A>C){
                    System.out.println("A ordem decrescente dos números é: " + B + ", " + A + ", " + C);
                } else if (B>C && C>A){
                    System.out.println("A ordem decrescente dos números é: " + B + ", " + C + ", " + A);
                } else if (C>A && A>B){
                    System.out.println("A ordem decrescente dos números é: " + C + ", " + A + ", " + B);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + C + ", " + B + ", " + A);
                }
            break;
            case 3:
            if (A>B && A>C) {
            System.out.println ("O número do meio é o maior, segue a sequência: " + B + ", " + A + ", " + C);
            } else if (B>A && B>C){
                System.out.println ("O número do meio é o maior, segue a sequência: " + A + ", " + B + ", " + C);
            } else if (C>A && C>B){
                System.out.println ("O número do meio é o maior, segue a sequência: " + A + ", " + C + ", " + B);
            }
            break;
        }
        teclado.close();
    }
}
