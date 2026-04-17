//1.Construa um programa que gere 30 letras aleatórias, concatene cada letra gerada na variável cadeia. Ao final da geração das letras, calcule e mostre quantas vogais existem na cadeia. 

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Gerar letra aleatória, e mostrar quantas vogais contém.");
        gerarLetraAleatoria();
    }
    static void gerarLetraAleatoria () {
        Random randon = new Random ();
        String cadeia = "";
        int vogais = 0;
        for (int i = 0; i < 30; i++){
            char letra = (char) (randon.nextInt (26) + 'a');
            cadeia += letra;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vogais++;
            }
        }
        System.out.println("As letras geradas foi: "+cadeia);
        System.out.println("A quantidade de vogais geradas foram: "+ vogais);
    }
}