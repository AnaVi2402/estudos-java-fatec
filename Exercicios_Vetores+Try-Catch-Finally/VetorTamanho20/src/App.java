//1. Construa um programa que popule um vetor de inteiros com números aleatórios entre -20 e 30. Calcule e mostre: 
//  xa. Trocar o 1º elemento com o 20º elemento, 2ª elemento com o 19º elemento e assim sucessivamente. 
//  xb. Informar o menor e maior negativo 
//  xc. Informar o menor e maior positivo 
//  xd. Escrever o vetor na ordem inversa 
//  xe. Trocar os valores dos elementos 1 a 10 com 11 a 20 
//  xf. Usuário informar um valor e localizar ou não no vetor 
//  xg. Informar a quantidade de números pares negativos  
//  xh. Informar a quantidade de números pares positivos 
//  xi. Criar novo vetor dentro do método e escrever os números negativos como positivos multiplicado por 2 

import Vetor.Inverso;
import Vetor.LerVetor;
import Vetor.LocalizarNum;
import Vetor.Negativo;
import Vetor.Positivo;
import Vetor.TrocaElementos;
import Vetor.TrocaVetor;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---EXERCICIO DE VETOR---");
        Scanner sc = new Scanner (System.in);

        //Enunciado
        int [] vetor = LerVetor.lerVetor();
        //a
        TrocaVetor.trocaVetor(vetor);
        //b
        System.out.println("O maior número negativo é: " + Negativo.MaiorNegativo(vetor));
        System.out.println("O menor número negativo é: " + Negativo.MenorNegativo(vetor));
        //c
        System.out.println("O maior número positivo é: " + Positivo.MaiorPositivo(vetor));
        System.out.println("O menor número positivo é: " + Positivo.MenorPositivo(vetor) + "\n");
        //d
        Inverso.inverso(vetor);
        //e
        TrocaElementos.trocaElementos(vetor);
        //f
        System.out.println("Digite um número para localizar no vetor: ");
        boolean numValido = false;
        while (!numValido){
            try {
                int num = sc.nextInt();
                System.out.println(LocalizarNum.localizar(vetor, num));
                numValido = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.nextLine(); 
            }
        }
        //g
        System.out.println("A quantidade de números pares negativos é: " + Vetor.ParesNegativo.pares(vetor) + "\n");
        //h
        System.out.println ("A quantidade de números pares positivos é: " + Vetor.ParesPositivos.pares(vetor) + "\n");
        //i
        Vetor.ConverterNegativos.converterNegativos(vetor);

        sc.close();
    }
}
