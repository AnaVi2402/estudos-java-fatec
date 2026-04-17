import java.util.Random;
//Exercício 1
public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        int a = gerador.nextInt(21);
        int b = gerador.nextInt(21);

        int result = soma(a, b);
        System.out.println("A soma do número " + a + " com o número " + b + " é igual a: " + result);

        result = subt(a, b);
        System.out.println("A subtração do número " + a + " com o número " + b + " é igual a: " + result);

        result = mult(a, b);
        System.out.println("A multiplicação do número " + a + " com o número "  + b + " é igual a: " + result);

        result = div(a, b);
        System.out.println("A divisão do número " + a + " com o número " + b + " é igual a: " + result);
    }
    static int soma(int a, int b) {
        return a + b;
    }
    static int subt(int a, int b) {
        return a - b;
    }
    static int mult(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
        return a / b;
    }
}