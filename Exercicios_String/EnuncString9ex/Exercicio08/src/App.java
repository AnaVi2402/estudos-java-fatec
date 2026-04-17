// 8.Construa um programa que receba uma frase em letras maiúsculas e converta todos os caracteres para minúsculas usando a função charAt() (calcular na tabela ASCII a distância da letra maiúscula e minúscula) 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        converter(frase);
        teclado.close();
    }
    static void converter (String frase){
        String minusculo = "";
        char letra = ' ';
        for (int i=0;i<frase.length();i++){
            letra = frase.charAt(i);
            if (letra >='A' && letra <= 'Z'){
                minusculo += (char)(letra + 32);
            }
            else {
                minusculo += letra;
            }
        }
        System.out.println("Segue a frase em letras maiúsculas: "+minusculo);
    }
}
