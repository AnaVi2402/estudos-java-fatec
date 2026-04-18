//  xh. Informar a quantidade de números pares positivos

package Vetor;

public class ParesPositivos {
    static public int pares (int [] vetor){
        int paresPos = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] % 2 == 0 && vetor [i] > 0){
                paresPos++;
            }
        }
        return paresPos;
    }
}
