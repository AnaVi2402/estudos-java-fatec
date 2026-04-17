import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criar e Gravar Arquivo!");

        FileWriter arquivo = null;
        Scanner ler = new Scanner (System.in);
        int contador, numero;

        System.out.println ("Informe um Número para Gerarmos a Tabuada: ");

        numero = ler.nextInt();
        arquivo = new FileWriter ("Tabuada.text");

        PrintWriter gravarArq = new PrintWriter (arquivo);
        gravarArq.printf ("+--- Tabuada do %d ---+\n", numero);

        for (contador = 1; contador <= 10; contador++){
            gravarArq.printf ("%d x %d = %d\n", contador, numero, (numero*contador));
        }
        gravarArq.printf ("+------------------+");

        arquivo.close();
        ler.close();
    }
}
