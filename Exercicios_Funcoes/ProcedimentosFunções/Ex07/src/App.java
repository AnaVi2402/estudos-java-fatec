import java.util.Scanner;
//Exercício 07
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("***CONTADOR***");
        System.out.println("Digite o início de uma contagem: ");
        int inicio = teclado.nextInt ();
        System.out.println("Digite de como gostaria que a contagem fosse feita: ");
        int incremento = teclado.nextInt ();
        System.out.println("Agora digite o fim desse contagem: ");
        int fim = teclado.nextInt();
        System.out.println(" ");
        Contador(inicio,incremento,fim);

        teclado.close();
    }
    static void Contador (int inicio,int incremento,int fim){
        if (fim > inicio){
            for (int i = inicio;i<(fim+1);i=i+incremento){
                System.out.println(i+"");
            }
        }else{
            for (int i = inicio;i >(fim-1);i=i-incremento){
                System.out.println(i+"");
            }
        }
    }
}
