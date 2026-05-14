//4. Construa um programa que preencha aleatoriamente uma matriz 4x4 entre 1 e 20, substitua a 1ª linha da matriz pela 2ª e a 4ª pela 3ª
import matriz.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Matriz 4x4 preenchida aleatoriamente entre 1 e 20:");
        int[][] matriz = Preenchimento.preencherMatriz(4,4,1,20);
        System.out.println("\nNova matriz com a 1ª linha com a substituição da 2ª e a 4ª linha com a substituição da 3ª: ");
        TrocaMatriz.troca(matriz);
    }
}
