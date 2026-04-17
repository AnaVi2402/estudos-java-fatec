import java.util.Scanner;
//Exercício 7
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Salário mensal\n\n Digite a quantidade total de horas trabalhadas:");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println("Digite a quantidade de horas extras do mês:");
        double horasExtras = teclado.nextDouble();
        System.out.println("Digite o valor em real do salário por hora: ");
        double valorHora = teclado.nextDouble();
        double salarioMensal = (horasTrabalhadas * valorHora) + (horasExtras * valorHora * 1.5);
        System.out.println("O salário a receber é: R$ " + salarioMensal);

        teclado.close();
    }
}
