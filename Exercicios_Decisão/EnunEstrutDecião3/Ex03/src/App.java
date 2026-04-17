//3- Construa um programa que gerencie as inscrições para a Olimpíada de Matemática considerando os critérios abaixo: 
// a. Idade mínima: 12 anos, máxima: 18 anos. 
// b. Nota mínima em matemática do ano anterior: 70. 
// c. OU: Se o aluno tiver participado de competições regionais, pode se inscrever mesmo com nota abaixo de 70. 
// d. Alunos com idade fora da faixa → inscrição negada. 
// e. Alunos com nota insuficiente E sem participação em competições → inscrição negada.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----INSCRIÇÃO DAS OLIMPÍADA DE MATEMÁTICA----");
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        String inscr = "";

        if (idade >= 12 && idade <=18){
            System.out.println("Digite sua nota de matemática do ano anterior: ");
            double nota = ler.nextDouble();
            ler.nextLine();
            System.out.println("Já participou de algum competição regional? (Digite sim ou não)");
            String comp = ler.nextLine();
            if (nota > 70 || comp.equalsIgnoreCase("sim")){
                inscr = "aprovada!";
            }
            else {
            inscr = "negada!";
            }
        }
        else {
            inscr = "negada!";
        }
        System.out.println("Sua inscrição foi "+inscr);
        ler.close();
    }
}
