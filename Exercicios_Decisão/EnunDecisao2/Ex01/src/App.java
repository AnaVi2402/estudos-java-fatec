import java.util.Scanner;
//Exercício 1
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho de laboratório: ");
        double notaLab = teclado.nextInt();
        System.out.println("Digite a nota da avaliação semestral: ");
        double notaSemestral = teclado.nextInt();
        System.out.println("Digite a nota do exame final: ");
        double notaExame = teclado.nextInt();
        double media = (notaLab * 2 + notaSemestral * 3 + notaExame * 5) / 10.0;
        if (media <= 10 && media >= 8){
            System.out.println("Sua nota é " + media + " e o conceito é A");
        }else if (media < 8 && media >= 7){
            System.out.println("Sua nota é " + media + " e o conceito é B");
        }else if (media < 7 && media >= 6){
            System.out.println("Sua nota é " + media + " e o conceito é C");
        }else if (media < 6 && media >= 5){
            System.out.println("Sua nota é " + media + " e o conceito é D");
        }else if (media < 5 && media >= 0){
            System.out.println("Sua nota é " + media + " e o conceito é E");
        }else{
            System.out.println("Nota inválida");
        }
        teclado.close();
    }
}