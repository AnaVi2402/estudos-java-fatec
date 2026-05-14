package onibus;

public class Lugares {
    public static String[][] assentos(){
        int num = 0;
        String[][] assentos = new String[12][4];
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                num++;
                assentos[i][j] = String.format("%02d", num);
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                System.out.print (assentos[i][j] + " ");
            }
            System.out.println();
        }
        return assentos;
    }
    public static String[][] reservado (String[][] assentos, String poltrona){
        String[][] reservado = assentos;
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                if (reservado[i][j].equals(poltrona)){
                    reservado[i][j] = "XX";
                }
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                System.out.print (reservado[i][j] + " ");
            }
            System.out.println();
        }
        return reservado;
    }
}
