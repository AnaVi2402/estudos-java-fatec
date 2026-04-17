import java.util.Scanner;
//Exercício 09
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("***CALCULANDO POTÊNCIA***\n");
        System.out.println("Digite a base da potência que deseja calcular: ");
        double base = teclado.nextInt();
        System.out.println("Agora digite o expoente: ");
        double expo = teclado.nextInt();

        System.out.println("O resultado da potência é: "+potencia(base,expo));

        teclado.close();
    }
    static double potencia (double base,double expoente){
        double result = base;
        for (int i=0;i<(expoente-1);i++){
            result = result * base;
        }
        return result;
    }
}
