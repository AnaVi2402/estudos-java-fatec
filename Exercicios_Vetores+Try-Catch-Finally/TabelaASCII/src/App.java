import criptografia.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("-----CRIPTOGRAFIA-----");
        System.out.println("Escolha uma opção: \n1.  Criptografar a frase; \n2.  Descriptografar a frase;  \n3.  Sair.");
        int opcao = sc.nextInt();
        sc.nextLine();
        while (opcao != 3){
            switch (opcao) {
                case 1 -> {
                    System.out.println("\nDigite uma frase para criptografar: ");
                    String frase = sc.nextLine();
                    String codigo = CriptFrase.codigo(frase);
                    System.out.println("A frase criptografada é: " + codigo);
                }
                case 2 -> {
                    System.out.println("\nDigite a frase que queira descriptografar: ");
                    String frase = sc.nextLine();
                    String fraseDescrip = DescripFrase.frase(frase);
                    System.out.println("A frase descriptografada é: " + fraseDescrip);
                    
                }
                default ->{
                    System.out.println("\nValor inválido, digite novamente!\n");
                }
            }
            System.out.println("\nEscolha uma opção: \n1.  Criptografar a frase; \n2.  Descriptografar a frase;  \n3.  Sair.");
            opcao = sc.nextInt();
            sc.nextLine();
            
        }
        System.out.println("Sistema finalizado!");
        sc.close();
    }
}
