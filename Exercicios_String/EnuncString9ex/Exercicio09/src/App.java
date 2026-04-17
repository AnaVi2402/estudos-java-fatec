//9.Construa um programa que receba uma frase e substitua as vogais (a-e-i-o-u) pelos caracteres (@-#-$-%-&) respectivamente, mostre a nova frase.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        caracter(frase);

        teclado.close();
    }
    static void caracter (String frase){
        String novafrase = "";
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)=='a' || frase.charAt(i)=='A'){
                novafrase += "@";
            }
            else if (frase.charAt(i)=='E' || frase.charAt(i)=='e'){
                novafrase += "#";
            }
            else if (frase.charAt(i)=='i' || frase.charAt(i)=='I'){
                novafrase += "$";
            }
            else if (frase.charAt(i)=='o' || frase.charAt(i)=='O'){
                novafrase += "%";
            }
            else if (frase.charAt(i)=='u' || frase.charAt(i)=='U'){
                novafrase += "&";
            }
            else {
                novafrase += frase.charAt(i);
            }
        }
        System.out.println("Segue a nova frase com caracteres: "+novafrase);
    }
}
