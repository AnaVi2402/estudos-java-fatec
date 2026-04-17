//1- Construa um programa que avalie a concessão de benefício de transporte público considerando os critérios abaixo: 
// a. Pessoas com idade ≥ 65 → gratuidade total 
// b. Pessoas com renda ≤ 2000 → desconto 50%, idade < 65 
// c. Estudantes → desconto 30%, independente da renda 
// d. Se pessoa for idoso E estudante → aplica desconto da gratuidade (100%), prioridade sobre estudante 
// e. Outros → preço normal 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("---Avaliação da concessão de benefício de tranporte público---");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Digite sua renda: ");
        double renda = leia.nextDouble();
        leia.nextLine();
        System.out.println("Você é estudante? (Digite sim ou não)");
        String estudante = leia.nextLine();
        int beneficio = 0;

        if (idade >= 65 || (idade >=60 && estudante.equalsIgnoreCase("sim"))){
            beneficio = 100;
        }else if (renda <= 2000 && idade < 65){
            beneficio = 50;
        }else if (estudante.equalsIgnoreCase("sim")){
            beneficio = 30;
        }else {
            beneficio = 0;
        }
        System.out.println("Você tem "+beneficio+"% de desconto no tranporte público.");
        leia.close();
    }
}
