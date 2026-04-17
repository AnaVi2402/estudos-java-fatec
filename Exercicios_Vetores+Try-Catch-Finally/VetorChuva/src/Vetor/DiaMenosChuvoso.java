package Vetor;

public class DiaMenosChuvoso {
    public static int MenosChuvoso (int [] vetor){
        int menosChuvoso = vetor[0];
        for (int num : vetor) {
            if (menosChuvoso > num){
                menosChuvoso = num;
            }
        }
        return menosChuvoso;
    }
    public static String PosicaoMenosChuvoso (int [] vetor){
        int menosChuvoso = vetor[0];
        int posicao = 0;
        String semana = "";
        for (int num : vetor) {
            if (menosChuvoso > num){
                menosChuvoso = num;
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
