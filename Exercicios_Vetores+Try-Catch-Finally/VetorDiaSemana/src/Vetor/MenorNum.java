package Vetor;

public class MenorNum {
    public static double Menor (double [] vetor){
        double menor = vetor[0];
        for (double num : vetor) {
            if (menor > num){
                menor = num;
            }
        }
        return menor;
    }
    public static String PosicaoMenor (double [] vetor){
        double menor = vetor[0];
        int posicao = 0;
        String semana = "";
        for (double num : vetor) {
            if (menor > num){
                menor = num;
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
