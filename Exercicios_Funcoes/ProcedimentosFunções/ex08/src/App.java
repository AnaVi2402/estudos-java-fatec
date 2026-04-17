import java.util.Scanner;
//Exercício 08
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite dua segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Sua media é: "+Media(nota1,nota2));

        teclado.close();
    }
    static double Media (double a,double b){
        return (a+b)/2;
    }
}
