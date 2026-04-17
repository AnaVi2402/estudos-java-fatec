import java.util.Scanner;
//Exercício 4
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int[4];
        System.out.println("Digite um número inteiro: ");
        int n1 = teclado.nextInt();
        vetor[0] = n1;
        for (int i=1;i<3;i++){
            System.out.println("Digite um numero inteiro maior que o anterior: ");
            int n = teclado.nextInt();
            if (n > vetor[i-1]){
                vetor[i] = n;
            } else {
                System.out.println("Número inválido!");
                i--; 
            }
        }
        System.out.println("Agora digite um número inteiro qualquer: ");
        int n2 = teclado.nextInt();
        vetor[3] = n2;
        System.out.println("\nNúmeros digitados: ");
        for (int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        teclado.close();
    }
}