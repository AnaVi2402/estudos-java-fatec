import java.util.Scanner;
import opcoes.ContCaracteres;
import opcoes.ContLetraA;
import opcoes.ContPalavra;
import opcoes.ContVogais;
import opcoes.Inverter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("""
                ----------MENU----------
                Escolha uma opção abaixo:
                1 - Contar Vogais;
                2 - Contar ocorrências da letra 'a';
                3 - Inverter String;
                4 - Contar palavras;
                5 - Contar Caracteres totais;
                6 - Remover espaços em branco;
                7 - Converter para maiúsculas;
                8 - Converter para minúsculas;
                0 - Sair.""");
        for (int i = 0; i < 1; i++){
            try {
                int opcao = sc.nextInt();
                sc.nextLine(); 
                while (opcao != 0){
                    switch (opcao){
                        case 1 -> {
                            int totalVogais = ContVogais.vogais(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println("Total de vogais na frase: " + totalVogais);
                            System.out.println("----------------------------------\n");
                        }

                        case 2 -> {
                            int LetraA = ContLetraA.LetraA(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Total de letra 'a' na frase é: " + LetraA);
                            System.out.println("----------------------------------\n");
                        }

                        case 3 -> {
                            String fraseInvertida = Inverter.inverter(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Frase invertida: " + fraseInvertida);
                            System.out.println("----------------------------------\n");
                        }

                        case 4 -> {
                            int palavras = ContPalavra.palavra(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Total de palavras na frase é: " + palavras);
                            System.out.println("----------------------------------\n");
                        }

                        case 5 -> {
                            int letras = ContCaracteres.caracteres(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Total de caracteres na frase é: " + letras);
                            System.out.println("----------------------------------\n");
                        }

                        case 6 -> {
                            String semEspaco = opcoes.RemovEspaco.removerEspaco(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Frase sem espaços: " + semEspaco);
                            System.out.println("----------------------------------\n");
                        }

                        case 7 -> {
                            String fraseMaiuscula = opcoes.ConvMaiuscula.maiuscula(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Frase em maiúsculas: " + fraseMaiuscula);
                            System.out.println("----------------------------------\n");
                        }

                        case 8 -> {
                            String fraseMinuscula = opcoes.ConvMinuscula.minuscula(frase);
                            System.out.println("\n----------------------------------");
                            System.out.println ("Frase em minúsculas: " + fraseMinuscula);
                            System.out.println("----------------------------------\n");
                        }

                        default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }
                    System.out.println("""
                            ----------MENU----------
                            Escolha uma opção abaixo:
                            1 - Contar Vogais;
                            2 - Contar ocorrências da letra 'a';
                            3 - Inverter String;
                            4 - Contar palavras;
                            5 - Contar Caracteres totais;
                            6 - Remover espaços em branco;
                            7 - Converter para maiúsculas;
                            8 - Converter para minúsculas;
                            0 - Sair.""");
                        opcao = sc.nextInt();
                        sc.nextLine();
                }
            }
            catch (Exception e) {
                System.out.println("Opção inválida. Por favor, insira um número inteiro.");
                sc.nextLine(); 
                i--;
            }    
        }
        System.out.println("Programa finalizado!");
        sc.close();
    }
}
