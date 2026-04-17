//1. Construa um programa que receba um nome e imprimir as 3 primeiras letras do nome. 

import java.util.Scanner;

public class App {
    static private String nome = "";
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um nome: ");
        Scanner teclado = new Scanner (System.in);
        nome = teclado.nextLine();
        System.out.println("As três primeiras letras desse nome é: "+TresLetras (nome)); 
        teclado.close();
    }
    static String TresLetras (String nome){
        if (nome.length() <= 3){
            return nome;
        }
        else {
            return nome.substring(0,3);
        }
    }
}
