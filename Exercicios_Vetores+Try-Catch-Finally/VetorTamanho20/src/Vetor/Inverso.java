//  xd. Escrever o vetor na ordem inversa

package Vetor;

public class Inverso {
    public static int [] inverso (int [] vetor){
        System.out.print("O vetor na ordem inversa é: ");
        for (int i = vetor.length; i > 0; i--){
            System.out.print(vetor [i-1] + " ");
        }
        System.out.println("\n");
        
        return vetor;
    }
    
}
