//  xc. Informar o menor e maior positivo

package Vetor;

public class Positivo {
    public static int MaiorPositivo (int [] vetor){
        //Integer.MIN_VALUE é o menor valor que um inteiro pode ter, ou seja, qualquer número positivo do vetor será maior que ele
        int maiorPositivo = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] > 0 && vetor [i] > maiorPositivo){
                maiorPositivo = vetor [i];
            }
        }
        return maiorPositivo;
    }
    public static int MenorPositivo (int [] vetor){
        //Integer.MAX_VALUE é o maior valor que um inteiro pode ter, ou seja, qualquer número positivo do vetor será menor que ele
        int menorPositivo = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] > 0 && vetor [i] < menorPositivo){
                menorPositivo = vetor [i];
            }
        }
        return menorPositivo;
    }
}
