import java.util.Scanner;
//Exercício 2
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o seu CPF: ");
        String CPF = teclado.nextLine();
        int soma = somaCPF (CPF);
        System.out.println("A soma de todos os números do CPF é: "+soma);

        teclado.close();
    }
    static int somaCPF (String CPF){
        int soma = 0;
        String apenasDigitos = CPF.replaceAll("\\D+",""); //Filtra da variável String letras e caracter, sobrando apenas números.

        for (int i=0;i<apenasDigitos.length();i++){
            int Digitos = Character.getNumericValue(apenasDigitos.charAt(i)); //Esse comando faz a alteração de String para números inteiros.
            soma += Digitos;
        }
        return soma;
    }
}
