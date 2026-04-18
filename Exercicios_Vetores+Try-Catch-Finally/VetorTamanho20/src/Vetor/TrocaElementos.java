//  xe. Trocar os valores dos elementos 1 a 10 com 11 a 20 

package Vetor;

import java.util.Arrays;

public class TrocaElementos {
    public static int [] trocaElementos (int [] vetor){
        int aux;
        for (int i = 0; i < vetor.length / 2; i++){
            aux = vetor [i+10];
            vetor [i+10] = vetor [i];
            vetor [i] = aux;
        }
        System.out.println("O vetor com os elementos trocados é (1 a 10 com 11 a 20): " + Arrays.toString(vetor)+"\n");
        return vetor;
    }
    
}
