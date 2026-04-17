//6- Construa um programa avalie a contratação de seguro para automóvel seguindo os critérios abaixo: 
//a. Motoristas com idade < 21 → seguro com taxa alta 
//b. Motoristas entre 21 e 30 → taxa média 
//c. Motoristas > 30 → taxa baixa 
//d. Motoristas com histórico de acidentes → taxa aumenta uma categoria 
//e. Motoristas com curso de direção defensiva → taxa diminui uma categoria

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----CONTRATAÇÃO DE SEGURO----");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        leia.nextLine();
        System.out.println("Já sofreu algum acidente de transito? Digite sim ou nao: ");
        String acidente = leia.nextLine().trim();
        System.out.println("Você possui um curso de direção ofensiva? Digite sim ou nao: ");
        String curso = leia.nextLine().trim();
        String taxa = "";
        if (idade <21){
            if (acidente.equalsIgnoreCase("nao") && curso.equalsIgnoreCase("sim")){
                taxa = "média";
            }
            else {
                taxa = "alta";
            }
        }
        else if (idade>=21 && idade <=30){
            if (acidente.equalsIgnoreCase("sim") && curso.equalsIgnoreCase("nao")){
                taxa = "alta";
            }
            else if (curso.equalsIgnoreCase("sim") && acidente.equalsIgnoreCase("nao")){
                taxa = "baixa";
            }
            else {
                taxa = "média";
            }
        }
        else {
            if (curso.equalsIgnoreCase("nao") && acidente.equalsIgnoreCase("sim")){
                taxa = "média";
            }
            else {
                taxa = "baixa";
            }
        }
        System.out.println("A sua taxa para contratação de seguro é "+taxa+"!");
        leia.close();
    }
}
