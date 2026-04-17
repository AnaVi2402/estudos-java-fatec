import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int a = teclado.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int b = teclado.nextInt();

        int result = soma(a, b);
        System.out.println("A soma do " + a + " e " + b + " é : " + result);

        result = subt(a, b);
        System.out.println("A subtração do " + a + " e " + b + " é : " + result);

        result = mult(a, b);
        System.out.println("A multiplicação do " + a + " e " + b + " é : " + result);

        result = div(a, b);
        System.out.println("A divisão do " + a + " e " + b + " é : " + result);
        
        teclado.close();
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
        return a / b;
    }
}
