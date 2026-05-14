//02. Construa um programa que preencha aleatoriamente uma matriz 3x3 entre 1 e 20, calcule e apresente:
//a. Soma dos números da matriz
//b. Média da soma dos números
//c. Mostrar a soma dos números dos índices pares

import java.text.DecimalFormat;
import matriz.*;

public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Matriz 3x3 preenchida aleatoriamente entre 1 e 20:");
        int[][] matriz = Preenchimento.preencherMatriz(3,3,1,20);
        System.out.println("A soma dos números da matriz é: "+ Contas.somaMatriz(matriz));
        System.out.println("A média da soma dos números é: "+ df.format(Contas.mediaSoma(Contas.somaMatriz(matriz), 9)));
        System.out.println("A soma dos números dos índices pares é: "+ Contas.somaPares(matriz));

    }
}
