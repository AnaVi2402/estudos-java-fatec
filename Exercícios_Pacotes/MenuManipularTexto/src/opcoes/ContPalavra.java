package opcoes;

public class ContPalavra {
    public static int palavra (String frase){
        String[] palavras = frase.trim().split("\\s+");
        int totalPalavras = palavras.length;

        return totalPalavras;
    }
}
