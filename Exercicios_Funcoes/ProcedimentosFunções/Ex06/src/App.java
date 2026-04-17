import java.util.Scanner;
//Exercício 06
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("***VERIFICANDO SE O NÚMERO É PAR OU ÍMPAR***");
        System.out.println("Digite um número: ");
        int num = teclado.nextInt();
        ParOuImpar (num);

        teclado.close();
    }
    static void ParOuImpar (int a){
        if (a%2 == 0){
            System.out.println("Esse número é par!");
        }else {
            System.out.println("Esse número é ímpar!");
        }
    }
}
