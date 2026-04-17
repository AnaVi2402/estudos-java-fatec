//5.Construa um programa que receba uma frase, calcule e mostre quantas vogais (a, e, i, o u) possui essa frase.
import java.util.Scanner;

public class App {
    static private String frase = "";
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();
        vogais (frase);

        teclado.close();
    }
    static void vogais (String frase1){
        int quantVogais = 0;
        String vog = "";
        for (int i=0;i<frase1.length();i++){
            if (frase1.charAt(i) == 'a' || frase1.charAt(i) == 'e' || frase1.charAt(i) == 'i' || frase1.charAt(i) == 'o' || frase1.charAt(i) == 'u' || frase1.charAt(i) == 'A' || frase1.charAt(i) == 'E' || frase1.charAt(i) == 'I' || frase1.charAt(i) == 'O' || frase1.charAt(i) == 'U'){
                quantVogais++;
                vog += frase1.charAt(i);
            }
        }
        System.out.println("A quantidade de vogais dentro dessa frase é: "+quantVogais);
        System.out.println("Segue as vogais: "+vog);
    }
}
