import java.util.Scanner;
//Exercício 1
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dia da Semana!\n");
        System.out.print("Digite um número de 1 a 7: \n");
        int diaDaSemana = teclado.nextInt();
        String nomeDoDia = "";
        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Valor inválido para o dia da semana.";
        }
        System.out.println(nomeDoDia);

        teclado.close();
    }
}
