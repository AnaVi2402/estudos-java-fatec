//9- Construa um programa que classifique os candidatos para viagens aventureiras segundo os critérios abaixo: 
//a. Idade mínima: 18 anos. 
//b. Peso ≤ 120 kg para atividades de alto risco. 
//c. OU: Participantes com certificado de atividade física avançada podem exceder peso. 
//d. Experiência prévia em esportes de aventura ≥ 2 anos aumenta prioridade. 
//e. Participantes com problemas cardíacos → proibidos de alto risco, independente de idade ou peso. 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----VIAGENS AVENTUREIRAS----");
        System.out.println ("Possuí algum problema cardíaco? Digite sim ou nao: ");
        String card = leia.nextLine();
        if (card.equalsIgnoreCase("sim")){
            System.out.println("Proibido participar por alto risco.");
        }
        else{
            System.out.println("Digite sua idade: ");
            int idade = leia.nextInt();
            System.out.println ("Digite seu peso: ");
            double peso = leia.nextDouble();
            leia.nextLine();
            System.out.println("Possuí alguma certificação que já participou de alguma atividade física avançada? Digite sim ou nao: ");
            String cert = leia.nextLine();
            if (idade >= 18 && (peso<=120 || cert.equalsIgnoreCase("sim"))){
                System.out.println("Digite quantos anos de experiência com esportes de aventura: ");
                int exp = leia.nextInt();
                if (exp >=2){
                    System.out.println("Você está classificada para participar dos esportes de aventura com prioridade!");
                }
                else {
                    System.out.println("Você está classificada para participar dos esportes de aventura sem prioridade!");
                }
            }
            else {
                System.out.println("Você não está classificado para participar dos esportes de aventura!");
            }
        }
        leia.close();
    }
}
