import java.util.Scanner;
//Exercício 3
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int num2 = teclado.nextInt();
        System.out.println("Digite um terceiro número inteiro: ");
        int num3 = teclado.nextInt();
        int result = num1;
        if (result < num2){
            result = num2;
            if (result < num3){
                result = num3;
            }
        } 
        System.out.println("O maior número é: " + result);
        teclado.close();
    }
}
