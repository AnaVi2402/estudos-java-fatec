package criptografia;

public class CriptFrase {
    public static String codigo (String frase){
        char[] fraseNormal = frase.toCharArray();
        char[] vetor = new char[frase.length()];
        
        for (int i=0; i<vetor.length;i++){
            //maiúscula
            if (fraseNormal[i] >= 65 && fraseNormal[i] <= 90){
                if (fraseNormal[i] >= 85){
                    vetor[i] = (char) (fraseNormal [i]-25+5);
                }
                else{
                    vetor [i] = (char) (fraseNormal [i]+5);
                }
            }
            //minúscula
            else if (fraseNormal[i] >= 97 && fraseNormal[i] <= 122){
                if (fraseNormal[i] >= 117){
                    vetor[i] = (char) (fraseNormal [i]-25+5);
                }
                else{
                    vetor [i] = (char) (fraseNormal [i]+5);
                }
            }
            else {
                vetor[i] = fraseNormal [i];
            }
        }

        String codigo = new String(vetor);
        return codigo;
    }
}
