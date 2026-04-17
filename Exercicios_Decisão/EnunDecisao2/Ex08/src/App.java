import java.util.Scanner;
//Exercício 8
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma data na sequência de dia, mês e ano: ");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
        System.out.println("Agora digite uma segunda data com a mesma sequência: ");
        int dia2 = teclado.nextInt();
        int mes2 = teclado.nextInt();
        int ano2 = teclado.nextInt();
        if (ano > ano2) {
            System.out.println("A primeira data é mais recente que a segunda.");
        } else if (ano < ano2) {
            System.out.println("A segunda data é mais recente que a primeira.");
        } else {
            if (mes > mes2) {
                System.out.println("A primeira data é mais recente que a segunda.");
            } else if (mes < mes2) {
                System.out.println("A segunda data é mais recente que a primeira.");
            } else {
                if (dia > dia2) {
                    System.out.println("A primeira data é mais recente que a segunda.");
                } else if (dia < dia2) {
                    System.out.println("A segunda data é mais recente que a primeira.");
                } else {
                    System.out.println("As duas datas são iguais.");
                }
            }
        }
        teclado.close();
    }
}