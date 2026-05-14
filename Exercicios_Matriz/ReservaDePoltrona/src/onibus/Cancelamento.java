package onibus;

public class Cancelamento {
    public static String[][] reservado (String[][] assentos, String[][] reservado, String cancelarPoltrona){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (assentos[i][j].equals(cancelarPoltrona)) {
                    reservado[i][j] = cancelarPoltrona;
                }
            }
        }
        return reservado;
    }
    
}
