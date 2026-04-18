//  xa. Trocar o 1º elemento com o 20º elemento, 2ª elemento com o 19º elemento e assim sucessivamente. 

package Vetor;

import java.util.Arrays;

public class TrocaVetor {
    public static int [] trocaVetor (int [] vetor){
        int aux;
        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }
        System.out.println("O vetor trocado (1° com 20°, 2° com 19°, ...): " + Arrays.toString (vetor)+"\n");
        return vetor;
    }
    
}
