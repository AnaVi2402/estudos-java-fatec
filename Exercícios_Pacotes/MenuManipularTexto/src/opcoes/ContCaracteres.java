package opcoes;

public class ContCaracteres {
    public static int caracteres (String frase){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra != ' '){
                contador++;
            }
        }
        return contador;
    }
    
}
