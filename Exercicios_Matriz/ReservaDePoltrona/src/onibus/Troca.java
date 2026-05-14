package onibus;

public class Troca {
    public static String[][] reservado (String[][] assentos, String[][] reservado, String trocaPoltrona, String novaPoltrona){
        for (int i=0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                if (assentos[i][j].equals(novaPoltrona)){
                    reservado[i][j] = "XX";
                }
            }
        }
        for (int i=0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                if (assentos[i][j].equals(trocaPoltrona)){
                    reservado[i][j] = trocaPoltrona;
                    
                }
            }
        }
        return reservado; 
    }
}
