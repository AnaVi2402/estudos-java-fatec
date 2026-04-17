package Vetor;

public class CalcularMedia {
    public static double Media (double [] vetor){
        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }
    
}