package Vetor;

import java.text.DecimalFormat;
import java.util.Random;

public class leitorVetor {
    public static double [] lerVetor (){
        Random numero = new Random();
        DecimalFormat df = new DecimalFormat("#.#");
        double [] vetor = new double [7];
        for (int i = 0; i < vetor.length; i++){
            System.out.println ("Entrada do novo número "+(i+1)+": ");
            try {
                vetor [i] = numero.nextDouble ((40-15)+1)+15;  
                System.out.println(df.format(vetor[i])+"\n");          
            }
            catch (Exception e) {
                System.out.println ("Valor inválido, tente novamente: \n");
                i--;
            }
        }
        return vetor;
    }
    
}
