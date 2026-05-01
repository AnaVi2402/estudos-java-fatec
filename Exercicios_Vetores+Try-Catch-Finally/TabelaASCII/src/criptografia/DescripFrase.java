package criptografia;

public class DescripFrase {
    public static String frase (String codigo){
        char[] fraseCript = codigo.toCharArray();
        char[] vetor = new char[codigo.length()];
        
        for (int i=0; i<vetor.length;i++){
            //maiúscula
            if (fraseCript[i] >= 65 && fraseCript[i] <= 90){
                if (fraseCript[i] <= 70){
                    vetor[i] = (char) (fraseCript [i]+25-5);
                }
                else{
                    vetor [i] = (char) (fraseCript [i]-5);
                }
            }
            //minúscula
            else if (fraseCript[i] >= 97 && fraseCript[i] <= 122){
                if (fraseCript[i] < 102){
                    vetor[i] = (char) (fraseCript [i]+25-5);
                }
                else{
                    vetor [i] = (char) (fraseCript [i]-5);
                }
            }
            else {
                vetor[i] = fraseCript [i];
            }
        }

        String frase = new String(vetor);
        return frase;
    }
}
