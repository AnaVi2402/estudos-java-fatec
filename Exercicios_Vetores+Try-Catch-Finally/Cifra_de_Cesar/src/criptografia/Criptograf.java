package criptografia;

public class Criptograf {
    public static char[] codigo(char[] fraseVet, char[] alfabeto){
        char[] codigo = new char [fraseVet.length];
        for (int i=0; i<fraseVet.length; i++){
            codigo [i] = fraseVet [i];
            for (int j=0; j < alfabeto.length; j++){
                if (alfabeto[j] == codigo [i]){
                    if ( j > 22){
                        codigo [i] = alfabeto [j-26+3];
                    }
                    else {
                        codigo [i] = alfabeto [j + 3];
                    }
                    break;
                }
            }
        }
        return codigo;
    }
    public static String criptografada (char[] codigo){
        String fraseCrip = new String (codigo);
        return fraseCrip;
    }
}
