import java.util.Scanner;
//Exercício 10 e 11
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite dua segunda nota: ");
        double nota2 = teclado.nextDouble();
        double result = Media(nota1,nota2);
        System.out.println("Sua media é: "+result+" e você está "+Situacao(result));

        teclado.close();
    }
    static double Media (double a,double b){
        return (a+b)/2;
    }
    static String Situacao (double media){
        if (media>7){
            return "aprovado!";
        }else if (media<=7 && media >5){
            return "em recuperação!";
        }
        else {
            return "reprovado!";
        }
    }
}