//8- Construa um programa que analise a elegibilidade de candidatos para Bolsa de Pesquisa Científica segundo os critérios abaixo: 
//a. Idade máxima: 35 anos. 
//b. Experiência mínima em pesquisa: 2 anos. 
//c. OU: Se o candidato tiver publicações em revistas internacionais, pode ser elegível mesmo sem experiência mínima. 
//d. Candidatos com pendências acadêmicas → não são elegíveis, independentemente das condições acima. 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----BOLSA DE PESQUISA CIENTÍFICA----");
        System.out.println("Você possuí alguma pendência acadêmica? Digite sim ou nao:");
        String pend = leia.nextLine();
        if (pend.equalsIgnoreCase("sim")){
            System.out.println("Infelizmente você não é elegível para se candidatar na Bolsa de Pesquisa Científica!");
        }
        else {
            System.out.println("Digite sua idade: ");
            int idade = leia.nextInt();
            if (idade>35){
                System.out.println("Infelizmente você não é elegível para se candidatar na Bolsa de Pesquisa Científica!");
            }
            else {
                leia.nextLine();
                System.out.println("Você possuí experiência de 2 anos em pesquisa? Digite sim ou nao: ");
                String exp = leia.nextLine();
                System.out.println("Você possuí alguma publicação em revistas internacionais? Digite sim ou nao: ");
                String pub = leia.nextLine();
                if (exp.equalsIgnoreCase("sim")||pub.equalsIgnoreCase("sim")){
                    System.out.println("Você é elegível para a Bolsa de Pesquisa Científica!");
                }
                else {
                    System.out.println("Infelizmente você não é elegível para se candidatar na Bolsa de Pesquisa Científica!");
                }
            }
        }
        leia.close();
    }
}
