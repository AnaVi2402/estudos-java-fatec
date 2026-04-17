package Vetor;

public class CalcularMedia {
    public static double media (double [] vetor){
        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }
    
}
