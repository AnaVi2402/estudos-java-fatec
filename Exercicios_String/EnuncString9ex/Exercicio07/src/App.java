//7.Construa um programa que receba uma frase em letras minúsculas e converta todos os caracteres para maiúsculas usando a função charAt() (calcular na tabela ASCII a distância da letra maiúscula e minúscula) 
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
        String maiusculo = "";
        char letra = ' ';
        for (int i=0;i<frase.length();i++){
            letra = frase.charAt(i);
            if (letra >='a' && letra <= 'z'){
                maiusculo += (char)(letra - 32);
            }
            else {
                maiusculo += letra;
            }
        }
        System.out.println("Segue a frase em letras maiúsculas: "+maiusculo);
    }
}
