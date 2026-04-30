import criptografia.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println(Alfabeto.letras());
        System.out.println("-----CRIPTOGRAFIA-----");
        System.out.println("Escolha uma opção: \n1.  Criptografar a frase; \n2.  Descriptografar a frase;  \n3.  Sair.");
        int opcao = sc.nextInt();
        sc.nextLine();
        while (opcao != 3){
            switch (opcao) {
                case 1 -> {
                    System.out.println("\nDigite uma frase para criptografar: ");
                    String frase = sc.nextLine();
                    char[] vetor = FraseVet.vetor(frase);
                    char[] alfabeto = Alfabeto.letras();
                    char[] codigo = Criptograf.codigo(vetor,alfabeto);
                    System.out.println("\nA frase criptografada é: "+Criptograf.criptografada(codigo));
                }
                case 2 -> {
                    System.out.println("\nDigite a frase que queira descriptogrfar: ");
                    String frase = sc.nextLine();
                    char[] alfabeto = Alfabeto.letras();
                    char[] fraseDescrip = Descrip.fraseDescrip(frase, alfabeto);
                    System.out.println("\nA frase descriptografada é: "+ Descrip.frase(fraseDescrip));
                }
                default ->{
                    System.out.println("\nValor inválido, digite novamente!\n");
                }
            }
            System.out.println("\nEscolha uma opção: \n1.  Criptografar a frase; \n2.  Descriptografar a frase;  \n3.  Sair.");
            opcao = sc.nextInt();
            
        }
        System.out.println("Sistema finalizado!");
        sc.close();
    }
}
