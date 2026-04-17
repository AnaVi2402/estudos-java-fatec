import java.text.DecimalFormat;
import java.util.Scanner;
//Exercício 2
public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a nota da primeira prova: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Insira a nota da segunda prova: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Insira a nota da terceira prova: ");
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 0 && media < 3) {
            System.out.println("Você tirou "+ df.format(media) +". Reprovado!");
        } else if (media >= 3 && media < 7) {
            double notaExame = 6-media;
            if (notaExame > 0) {
                System.out.println("Exame! Você tirou "+ df.format(media) +" e precisa tirar " + notaExame + " para ser aprovado.");
            } else {
                System.out.println("Exame! Você já tirou "+ df.format(media) +" e está aprovado, mas precisa fazer o exame para melhorar a nota.");
            }
        } else if (media >= 7 && media <= 10) {
            System.out.println("Você tirou "+ df.format(media) +". Aprovado!");
        } else {
            System.out.println("Nota inválida");
        }
        teclado.close();
    }
}
