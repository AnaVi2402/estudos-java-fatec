package Vetor;

import java.util.Random;

public class LeitorVetor {
   public static int [] lerVetor (){
        Random numero = new Random();
        int [] vetor = new int [7];
        for (int i = 0; i < vetor.length; i++){
            System.out.println ("Entrada do novo número "+(i+1)+": ");
            try {
                vetor [i] = numero.nextInt ((83-2)+1)+2;  
                System.out.println(vetor[i]+"\n");          
            }
            catch (Exception e) {
                System.out.println ("Valor inválido, tente novamente: \n");
                i--;
            }
        }
        return vetor;
    }
    
}
