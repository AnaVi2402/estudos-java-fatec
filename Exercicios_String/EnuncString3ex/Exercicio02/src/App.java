//2.Construa um programa que gere 30 letras aleatórias, concatene cada letra gerada na variável cadeia. Ao final da geração das letras, calcule e mostre quantas letras “c”, “k” e “a” foram geradas. 

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Gerar 30 letras aleatórias.");
        Random ran = new Random ();
        String cadeia = "";
        int cka = 0;

        for (int i=0;i<30;i++){
            char letra = (char) (ran.nextInt (26) + 'a');
            cadeia += letra;
            if (letra == 'a' || letra == 'c' || letra == 'k'){
                cka++;
            }
        }
        System.out.println("O conjunto de letras geradas foi: "+cadeia);
        System.out.println("A quantidade de letras 'c', 'k' e 'a' geradas foram: "+cka);
    }
}
