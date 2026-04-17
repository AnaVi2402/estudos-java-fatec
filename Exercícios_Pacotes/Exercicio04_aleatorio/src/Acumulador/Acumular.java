package Acumulador;

import java.util.Random;

public class Acumular {
    public void acm(){
        Random gerador = new Random();
        int acumulador = 0;
        int num = gerador.nextInt((5-1)+1)+1;
        int contador = 0;

        while (contador<=num){
            acumulador =+ gerador.nextInt(100);
            contador++;
        }
        System.out.println ("O valor acumulado é: " + acumulador+ " e foi repetido " +num+" vezes.");
    }
}
