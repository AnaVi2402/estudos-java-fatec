//11- Construa um programa que gerencie a seleção de candidatos para curso de Programação de Computadores conforme os critérios abaixo: 
//a. Idade mínima: 18, máxima: 40. 
//b. Nota do teste ≥ 75 → aprovado 
//c. Experiência ≥ 2 anos → bônus 
//d. OU: Certificação reconhecida pode substituir experiência 
//e. Nota < 75 E sem certificação → reprovado 
//f. Idade fora da faixa → reprovado, independente das outras condições

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----CURSO DE PROGRAMADORES DE COMPUTADORES----");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        if (idade <18 || idade>40){
            System.out.println("Reprovado pela idade!");
        }
        else {
            System.out.println("Digite a nota da prova: ");
            double nota = leia.nextDouble();
            System.out.println("Digite quantos anos você tem de experiência: ");
            int exp = leia.nextInt();
            leia.nextLine();
            System.out.println("Possui alguma certificação reconhecida? Digite sim ou nao: ");
            String cert = leia.nextLine();
            if (nota>=75 && (exp>=2 || cert.equalsIgnoreCase("sim"))){
                System.out.println("Aprovado!");
            }
            else {
                System.out.println("Reprovado!");
            }
        }
        leia.close();
    }
}
