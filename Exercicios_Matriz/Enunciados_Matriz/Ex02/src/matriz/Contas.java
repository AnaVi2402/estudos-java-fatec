package matriz;

public class Contas {
    public static int somaMatriz (int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    public static double mediaSoma (int soma, int totalElementos){
        double media = soma / totalElementos;
        return media;
    }
    public static int somaPares (int[][] matriz) {
        int somaPares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    somaPares += matriz[i][j];
                }
            }
        }
        return somaPares;
    }
}
