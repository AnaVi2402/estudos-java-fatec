package matriz;
import java.text.DecimalFormat;
import java.util.Random;

public class Preenchimento {
    public static int[][] preencherMatriz(int linhas, int colunas, int min, int max) {
        DecimalFormat df = new DecimalFormat("00");
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(df.format(matriz[i][j]) + " ");
            }
            System.out.println("");
        }
        return matriz;
    }

}
