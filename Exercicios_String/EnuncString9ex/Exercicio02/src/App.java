//2. Construa um programa que receba uma frase, componha duas strings, uma string com os caracteres da posição par e outra string da posição ímpar. Imprimas as duas strings. 

public class App {
    private static String frase = "";
    private static String frasePar = "";
    private static  String fraseImpar = "";

    public static void main(String[] args) throws Exception {
        System.out.println("Frases pares e ímpares.");
        frase = "Tu te torna eternamete responsável por aquilo que tu cativas!";
        char letra = ' ';

        for (int i=0;i<frase.length();i++){
            if (i%2 == 0){
                letra = frase.charAt(i);
                geradorpar (letra);
            }
            else{
                letra = frase.charAt(i);
                geradorimpar (letra);
            }
        }
        System.out.println("O String par gerado foi: "+frasePar);
        System.out.println("O String ímpar gerado foi: "+fraseImpar);
    }
    static void geradorpar (char nome){
        System.out.println("Letra recebida: "+nome);
        frasePar += nome;
    }
    static void geradorimpar (char nome){
        System.out.println("Letra recebida: "+nome);
        fraseImpar += nome;
    }
}
