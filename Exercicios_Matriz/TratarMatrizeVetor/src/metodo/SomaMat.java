package metodo;

public class SomaMat {
    public static int escreverMatriz(int[][] matriz) {
        int soma = 0;
        System.out.println("\nMatriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
                soma += matriz[i][j];
            }
            System.out.println();
        }
        return soma;
    }   
}
