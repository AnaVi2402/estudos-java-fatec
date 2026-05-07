package metodo;

public class AcumularRep {
    public static int acumularRepetidos(int[][] matriz, int[] vetorRepetidos) {
        int valor = 0, soma = 0, nro = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            valor = matriz[i][j];        
            soma += valor;         
            AcumularElem.acumulaElemento(valor, vetorRepetidos);
            }
        }

        System.out.println("\nVetor de Repetidos: ");
        for (int i = 0; i < vetorRepetidos.length; i++) {
            nro = i + 1;
            System.out.println("Numero " + nro + " se repete " + vetorRepetidos[i] + " vezes.");

        }
        return soma;
    }
    
}
