import java.text.DecimalFormat;
import java.util.Scanner;
//Exercício 11
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Digite o valor do salário base: ");
        double salarioBase = teclado.nextDouble();
        System.out.println("Digite qual é o seu sexo: \nM - Masculino \nF - Feminino");
        char sexo = teclado.next().charAt(0);
        switch (sexo) {
            case 'M':
            case 'm':
                System.out.println("O valor total do salário para homens é R$" + df.format((salarioBase*1.15)*1.01));
                break;
            case 'F':
            case 'f':
                System.out.println ("O valor total do salário para mulheres é R$" + df.format ((salarioBase*1.2)*1.05));
                break;
            default:
                System.out.println("Sexo inválido. O salário base permanecerá o mesmo.");
                break;
        }
        teclado.close();
    }
}