package onibus;

public class Resumo {
    public static void imprimir (String reservado[][]){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(reservado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int vendidos (String reservado[][]){
        int vendido = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (reservado[i][j].equals("XX")) {
                    vendido++;
                }
            }
        }
        return vendido;
    }
    public static int disponiveis (String reservado[][]){
        int disponivel = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (reservado[i][j].equals("   ")) {
                    disponivel++;
                }
            }
        }
        return disponivel;
    }
}

