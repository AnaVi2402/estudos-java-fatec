//3.Construa um programa que gere 30 números inteiros aleatórios entre 1 e 9, acumule cada número gerado na variável acumulado. Ao final da mostre a soma dos números gerados. 

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Geração de números de 1 a 9.");
        Random ran = new Random ();
        int min = 1, max = 10;
        int acumulado = 0;
        for (int i=0;i<30;i++){
            acumulado += ran.nextInt((max-min)+1)+min;
        }
        System.out.println("A soma dos números gerados é: "+acumulado);
    }
}
