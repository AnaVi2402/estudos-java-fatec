import java.util.Scanner;
//Exercício 7
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escolha uma opção abaixo: \n1 - Somas dois números; \n2 - Raiz quadrada de um número.");
        int opcao = teclado.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o primeiro número: ");
            int num1 = teclado.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();
            int resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if (opcao == 2) {
            System.out.println("Digite um número para calcular a raiz quadrada: ");
            double num = teclado.nextDouble();
            double resultado = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é: " + resultado);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
        teclado.close();
    }
}