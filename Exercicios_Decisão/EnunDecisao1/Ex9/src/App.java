import java.text.DecimalFormat;
import java.util.Scanner;
//Exercício 9
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();
        System.out.println("Esse produto é:\n 1 - Nacional;\n 2 - Importado.");
        int tipoProduto = teclado.nextInt();
        switch (tipoProduto) {
            case 1:
                System.out.println("O valor do produto nacional é: " + formatador.format(valorProduto*1.1)); // Adiciona 10% de imposto
                break;
            case 2:
                System.out.println("O valor do produto importado é: " + formatador.format(valorProduto*1.3)); // Adiciona 30% de imposto
                break;
            default:
                System.out.println("Tipo de produto inválido.");
        }
        teclado.close();
    }
}
