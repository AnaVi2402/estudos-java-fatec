package opcoes;

public class ContLetraA {
    public static int LetraA (String frase){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            char LetraA = frase.charAt(i);
            if (LetraA == 'a' || LetraA == 'A'){
                contador++;
            }
        }
        return contador;
    }
    
}
