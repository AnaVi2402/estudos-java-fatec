import java.util.Scanner;
//Exercício 5
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num < 10){
            System.out.println("O número é menor que 10.");
        } else if (num == 10){
            System.out.println("O número é igual a 10.");
        } else {
            System.out.println("O número é maior que 10.");
        }
        teclado.close();
    }
}
