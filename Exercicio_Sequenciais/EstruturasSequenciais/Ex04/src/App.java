import java.util.Scanner;
//Exercício 4
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salario = teclado.nextDouble();
        double aumento = salario * 1.25;
        System.out.println("O novo salário com o aumento é R$" + aumento);

        teclado.close();
    }
}