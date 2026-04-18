//  xf. Usuário informar um valor e localizar ou não no vetor

package Vetor;

public class LocalizarNum {
    public static String localizar (int [] vetor, int num){
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] == num){
                return "O número " + num + " foi localizado na " + (i+1) + "ª posição do vetor.\n";
            }
        }
        return "O número " + num + " não foi localizado no vetor.\n";
    }
}
