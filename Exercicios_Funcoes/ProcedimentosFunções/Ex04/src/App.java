import java.util.Scanner;
//Exercício 04
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt();
        System.out.println ("Digite um segundo número: ");
        int num2 = teclado.nextInt ();
        int soma = Somador (num1,num2);
        System.out.println("A soma dos números é: "+soma);

        teclado.close();
    }
    static int Somador (int a, int b){
        return a+b;
    }
}
//Um exemplo de função com retorno.