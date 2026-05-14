//03. Construa um programa que preencha aleatoriamente uma matriz 4x4 entre 1 e 20, calcule e apresente:
//a. Maior número da matriz
//b. Menor número da matriz
//c. Informe a diferença de números entre o menor e o maior


import matriz.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Matriz 4x4 preenchida aleatoriamente entre 1 e 20:");
        int[][] matriz = Preenchimento.preencherMatriz(4,4,1,20);
        int Maior = MaiorNum.maior(matriz);
        int Menor = MenorNum.menor(matriz);
        System.out.println("O maior número da matriz é: " + Maior);
        System.out.println("O menor número da matriz é: " + Menor);
        System.out.println ("A diferença entre o maior e o menor número é: " + (Maior - Menor));
    }
}
