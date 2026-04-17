//4.Construa um programa que receba uma frase e imprima de trás-para-frente. 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        inverso (frase);

        teclado.close();
    }
    static void inverso (String frase){
        String contrario = "";
        for (int i=frase.length()-1;i>=0;i--){ 
            contrario += frase.charAt(i);
        }
        System.out.println("A frase ao contrário é: "+contrario);
    }
}
