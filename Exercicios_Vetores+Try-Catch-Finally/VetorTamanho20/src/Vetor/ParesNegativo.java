//xg. Informar a quantidade de números pares negativos

package Vetor;

public class ParesNegativo {
    public static int pares (int [] vetor){
        int paresNeg = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] % 2 == 0 && vetor [i] < 0){
                paresNeg++;
            }
        }
        return paresNeg;
    }
    
}
