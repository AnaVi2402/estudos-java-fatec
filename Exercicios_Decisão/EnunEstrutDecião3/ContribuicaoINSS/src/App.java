import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        System.out.println("Digite seu salário: ");
        double salario = teclado.nextDouble();
        double INSS = 0.0;
        if (salario<=1040.22){
            INSS = salario*0.08;
        }
        else if (salario>=1040.23 && salario<=1733.70) {
            INSS = salario*0.09;
        }
        else if (salario>=1733.70 && salario<=3467.40){
           INSS = salario*0.11; 
        }
        else {
            INSS = 381.41;
        }
        System.out.println("O valor descontado do INSS é "+df.format(INSS));

        teclado.close();
    }
}
