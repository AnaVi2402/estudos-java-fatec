//  xb. Informar o menor e maior negativo 

package Vetor;

public class Negativo {
    public static int MaiorNegativo (int [] vetor){
        int maiorNegativo = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] < 0 && vetor [i] > maiorNegativo){
                maiorNegativo = vetor [i];
            }
        }
        return maiorNegativo;
    }
    public static int MenorNegativo (int [] vetor){
        int menorNegativo = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] < 0 && vetor [i] < menorNegativo){
                menorNegativo = vetor [i];
            }
        }
        return menorNegativo;
    }
}
