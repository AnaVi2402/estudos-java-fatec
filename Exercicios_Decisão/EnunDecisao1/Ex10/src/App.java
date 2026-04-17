import java.util.Scanner;
//Exercício 10
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        System.out.println("Insira a operação desejada: + (Adição), -(Subtração), *(Multiplicação) e /(Divisão)");
        char operacao = teclado.next().charAt(0);
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        teclado.close();
    }
}
