import java.util.Scanner;
//Exercício 5
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salario = teclado.nextDouble();
        System.out.println("Digite o percentual de aumento: ");
        double percentual = teclado.nextDouble();
        double aumento = salario * percentual / 100;
        double salarioFinal = salario + aumento;
        System.out.println("O salário final é: " + salarioFinal);

        teclado.close();
    }
}