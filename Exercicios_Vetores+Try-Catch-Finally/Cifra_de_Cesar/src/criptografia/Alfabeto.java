package criptografia;

public class Alfabeto {
    public static char[] letras(){
        char letras [] = new char [26];
        int Nletra = 65;
        for (int i=0;i<=25;i++){
            letras [i] = (char) Nletra;
            Nletra++;
        }
        return letras;
    }
    
}
