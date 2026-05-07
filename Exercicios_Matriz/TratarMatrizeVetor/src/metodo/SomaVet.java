package metodo;

public class SomaVet {
    public static int escreverVetor(int[] vetor) {
        int soma = 0;
        System.out.println("\nVetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " - ");
            soma += vetor[i];
        }
        return soma;
    }   
}
