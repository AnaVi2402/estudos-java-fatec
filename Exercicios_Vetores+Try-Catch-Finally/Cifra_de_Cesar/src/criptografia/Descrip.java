package criptografia;

public class Descrip {
    public static char[] fraseDescrip (String fraseCrip,char[] alfabeto){
        char[] codigo = fraseCrip.toCharArray();
        char[] fraseDescrip = new char[codigo.length];
        for (int i=0; i<codigo.length; i++){
            fraseDescrip [i] = codigo [i];
            for (int j=0; j < alfabeto.length; j++){
                if (alfabeto[j] == fraseDescrip [i]){
                    if ( j < 3){
                        fraseDescrip [i] = alfabeto [j+26-3];
                    }
                    else {
                        fraseDescrip [i] = alfabeto [j - 3];
                    }
                    break;
                }
            }
        }
        return fraseDescrip;
    }  
    public static String frase (char[] fraseDescrip){
        String frase = new String(fraseDescrip);
        return frase;
    }
}
