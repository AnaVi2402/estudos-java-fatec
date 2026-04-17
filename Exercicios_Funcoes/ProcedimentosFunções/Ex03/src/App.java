import java.util.Scanner;
//Exercício 03
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt ();
        System.out.println ("Digite um outro número: )");
        int num2 = teclado.nextInt ();
        somador (num1,num2);
        teclado.close();
    }
    static void somador (int a, int b){
        System.out.print ("A soma dos dois números é: "+(a+b));
    }
}
//essa é uma função sem retorno.