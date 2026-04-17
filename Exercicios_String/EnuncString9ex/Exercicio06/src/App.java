//6.Construa um programa que receba uma frase e imprima a frase sem suas vogais.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        svogais (frase);

        teclado.close();
    }
    static void svogais (String frase){
        String consoantes = "";
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i) != 'a' && frase.charAt(i) != 'A' && frase.charAt(i) != 'e' && frase.charAt(i) != 'E' && frase.charAt(i) != 'i' && frase.charAt(i) != 'I' && frase.charAt(i) != 'o' && frase.charAt(i) != 'O' && frase.charAt(i) != 'u' && frase.charAt(i) != 'U'){
                consoantes += frase.charAt(i);
            }
        }
        System.out.println("Segue a frase sem vogais: "+consoantes);
    }
}
