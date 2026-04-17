import java.util.Scanner;
//Exercício 6
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salario = teclado.nextDouble();
        double gratificao = salario * 0.05;
        double imposto = salario * 0.07;
        double salarioFinal = salario + gratificao - imposto;
        System.out.println("O salário final do funcionário é R$" + salarioFinal);

        teclado.close();
    }
}