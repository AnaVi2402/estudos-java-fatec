//2- Construa um programa que avalie a seleção de candidatos para cursos de tecnologia considerando os critérios abaixo: 
// a. Idade entre 18 e 35 → permitido 
// b. Nota mínima de 70 no teste de admissão → permitido 
// c. Experiência em programação ≥ 2 anos → bônus 
// d. OU: Se candidato tiver certificação reconhecida, pode ser aprovado mesmo sem experiência 
// e. Se não atender idade OU nota → rejeitado 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----CONCURSO DE TECNOLOGIA----");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Digite a nota tirada no teste: ");
        double nota = leia.nextDouble();
        System.out.println("Digite quantos anos você possui de experiência com a programação: ");
        double exper = leia.nextDouble();
        leia.nextLine();
        System.out.println("Você possui alguma certificação reconhecida? (Digite sim ou não)");
        String certif = leia.nextLine();
        String teste = "";
        String bonus = "";
        
        if ((idade >= 18 && idade <= 35) && nota >= 70){
            teste = "aprovada";
            if (exper >= 2 || certif.equalsIgnoreCase("sim")){
                bonus = " com pontos extras!";
            }else{
                bonus = " sem pontos extras!";
            }
        }else {
            teste = "reprovada!";
        }
        System.out.println("Sua inscrição foi "+teste+bonus);
        leia.close();
    }
}
