import metodo.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***Tratramento de Matriz e Vetor***");

        int[] vetorAleatorio = PopularVetor.popularVetorAleatorio(5);
        int[][] matrizAleatoria = PopularMatriz.popularMatrizAleatoria(5, 5);
        int [] vetorRepetidos = new int[5];

        int soma = SomaVet.escreverVetor(vetorAleatorio);
        System.out.println("\nSoma retornada do Vetor....: " + soma);

        soma = SomaMat.escreverMatriz(matrizAleatoria);
        System.out.println("Soma retornada da Matriz....: " + soma);
      
        soma = AcumularRep.acumularRepetidos(matrizAleatoria, vetorRepetidos);
        System.out.println("Soma dos numeros repetidos da Matriz....: " + soma);

    }  
}

