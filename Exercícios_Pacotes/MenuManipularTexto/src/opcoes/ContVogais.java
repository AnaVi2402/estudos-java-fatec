package opcoes;

public class ContVogais {
    public static int vogais (String frase){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                contador++;
            }
        }
        return contador;
    }
    
}
