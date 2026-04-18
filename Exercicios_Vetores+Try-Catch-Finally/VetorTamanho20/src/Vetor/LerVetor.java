//1. Construa um programa que popule um vetor de inteiros com números aleatórios entre -20 e 30. Calcule e mostre: 

package Vetor;

import java.util.Arrays;
import java.util.Random;

public class LerVetor {
    public static int [] lerVetor (){
        Random numero = new Random ();
        int [] vetor = new int [20];
        for (int i=0; i < vetor.length; i++){
            try {
                vetor [i] = numero.nextInt((30 - (-20))+1) + (-20);
            }
            catch (Exception e){
                System.out.println ("Valor inválido, tente novamente: \n");
                i--;
            }
        }
        System.out.println("O vetor principal é: " + Arrays.toString(vetor)+"\n");
        return vetor;
    }    
}
