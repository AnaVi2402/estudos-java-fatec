//3-Construa um programa que receba uma frase, calcule e retorne quantas letras tem essa 
//frase.

public class App {
    static private String frase = "";
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de quantas letras contém na frase.\n");
        frase = "Tu te torna eternamete responsável por aquilo que tu cativas!";
        quantidadeLetra (frase);
    }
    static void quantidadeLetra (String frase1){
        int contador = 0;
        char letras = ' ';
        for (int i=0;i<frase1.length();i++){
            letras = frase1.charAt (i);
            if (letras != ' ' && letras != '!' && letras != '.' && letras != ','){
                contador++;
            }
        }
        System.out.println("O número total de letras nesse frase é: "+contador);
    }
}
