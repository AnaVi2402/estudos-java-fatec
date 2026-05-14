package matriz;

import java.text.DecimalFormat;

public class TrocaMatriz {
    public static int [][] troca(int[][] matriz){
        int[][] novaMatriz = new int[matriz.length][matriz[0].length];
        DecimalFormat df = new DecimalFormat("00");
        for (int i=0; i<matriz.length; i++){
            novaMatriz[0][i] = matriz[1][i];
            novaMatriz[1][i] = matriz[0][i];
            novaMatriz[2][i] = matriz[3][i];
            novaMatriz[3][i] = matriz[2][i];
        }
        for (int i = 0; i < novaMatriz.length; i++) {
            for (int j = 0; j < novaMatriz[0].length; j++) {
                System.out.print(df.format(novaMatriz[i][j]) + " ");
            }
            System.out.println("");
        }
        return novaMatriz;
    }
}
