package onibus;

public class Vendas {
    public static int quantidadeVendas (String[][] reservados){
        int quantidadeVendas = 0;
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                if (reservados[i][j].equals("XX")){
                    quantidadeVendas++;
                }
            }
        }
        return quantidadeVendas;
    }
    public static double valorTotal (int quantidadeVendas, double valorPassagem){
        return quantidadeVendas * valorPassagem;
    }
}
