//5- Construa um programa que permita controlar as inscrições de candidatos para participarem de curso de idiomas segundo os critérios abaixo: 
//a. Alunos com idade ≥ 6 podem se inscrever. 
//b. Para iniciantes: nota de proficiência ≤ 30. 
//c. Para intermediários: nota entre 31 e 70. 
//d. Para avançados: nota > 70. 
//e. OU: Alunos com recomendação de professor podem entrar em nível superior mesmo com nota menor. 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----INSCRIÇÃO DE CURSO DE IDIOMAS----");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        if (idade>=6){
            System.out.println("Digite qual foi sua nota de poficiência: ");
            double nota = leia.nextDouble();
            leia.nextLine();
            System.out.println("Tem alguma recomendação de professor para entrar no nível superior? (digite sim ou não)");
            String recom = leia.nextLine();
            String profic = "";
            if (nota > 70 || recom.equalsIgnoreCase("sim")){
                profic = "avançado!";
            }else if (nota >= 31 && nota <= 70){
                profic = "intermediário!";
            }
            else {
                profic = "iniciante!";
            }
            System.out.println("Parabéns! Você entrou para o nosso curso de idioma "+profic);
        }
        else {
            System.out.println("Inscrição não aceita, é necessário ter idade maior ou igual a 6 anos!");
        }
        leia.close();
    }
}
