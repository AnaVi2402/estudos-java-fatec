import java.util.Scanner;
//Exercício 05
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("***MOSTRANDO QUAL O MAIOR NÚMERO DIGITADO***");
        System.out.println("Digite um número: ");
        int a = teclado.nextInt();
        System.out.println ("Digite um segundo número: ");
        int b = teclado.nextInt ();
        System.out.println("Segue o resultado: ");
        Maior (a,b);

        teclado.close();
    }
    static void Maior (int a, int b){
        if (a>b){
            System.out.println(a);
        }else if (b>a){
            System.out.println(b);
        }
        else {
            System.out.println("Os números são iguais!");
        }
    }
}
