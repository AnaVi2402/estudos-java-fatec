import java.util.Scanner;
//Exercício 8
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();
        System.out.println("Escolha qual será a forma de pagaemnto: \na - Dinheiro ou pix; \nb - A A vista no cartão de crédito.");
        char opcao = teclado.next().charAt(0);
        if (opcao == 'a') {
            double valorFinal = valorProduto - (valorProduto* 0.1);
            System.out.println("O valor final do produto é: " + valorFinal);
        } else if (opcao == 'b') {
            double valorFinal = valorProduto - (valorProduto * 0.05);
            System.out.println("O valor final do produto é: " + valorFinal);
        } else {
            System.out.println("Opção inválida.");
        }
        teclado.close();
    }
}
