package Vetor;

public class DiaMaisChuvoso {
    public static int MaisChuvoso (int [] vetor){
        int maisChuvoso = vetor[0];
        for (int num : vetor) {
            if (maisChuvoso < num){
                maisChuvoso = num;
            }
        }
        return maisChuvoso;
    }
    public static String PosicaoMaisChuvoso (int [] vetor){
        int maisChuvoso = vetor[0];
        int posicao = 0;
        String semana = "";
        for (int num : vetor) {
            if (maisChuvoso < num){
                maisChuvoso = num;
                posicao++;
                if (posicao == 0){
                    semana = "Domingo";
                }
                else if (posicao == 1){
                    semana = "Segunda-feira";
                }
                else if (posicao == 2){
                    semana = "Terça-feira";
                }
                else if (posicao == 3){
                    semana = "Quarta-feira";
                }
                else if (posicao == 4){
                    semana = "Quinta-feira";
                }
                else if (posicao == 5){
                    semana = "Sexta-feira";
                }
                else if (posicao == 6){
                    semana = "Sábado";
                }
            }
        }
        return semana;
    }
}
