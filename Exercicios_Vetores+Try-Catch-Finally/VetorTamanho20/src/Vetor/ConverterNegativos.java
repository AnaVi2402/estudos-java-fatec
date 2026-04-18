//  xi. Criar novo vetor dentro do método e escrever os números negativos como positivos multiplicado por 2 

package Vetor;

public class ConverterNegativos {
    public static int [] converterNegativos (int [] vetor){
        int [] vetorConvertido = new int [vetor.length];
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] < 0){
                vetorConvertido [i] = vetor [i] * -2;
            } else {
                vetorConvertido [i] = vetor [i];
            }
        }
        System.out.println("Vetor com os números negativos convertidos em positivos multiplicados por 2: " + java.util.Arrays.toString(vetorConvertido) + "\n");
        return vetorConvertido;
    }
    
}
