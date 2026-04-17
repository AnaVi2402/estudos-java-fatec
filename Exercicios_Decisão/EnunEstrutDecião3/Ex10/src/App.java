//10- Construa um programa que gerencie a prioridade para internação em um hospital segundo os critérios abaixo: 
//a. Pacientes com condição crítica → prioridade máxima. 
//b. Pacientes idosos (> 65 anos) com sintomas graves → prioridade alta. 
//c. Pacientes com doenças crônicas E sintomas moderados → prioridade média. 
//d. Pacientes sem condições especiais → prioridade baixa. 
//e. OU: Pacientes gestantes → prioridade alta, independentemente da idade ou sintomas.  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("---PRIORIDADE DE INTERNAÇÃO---");
        System.out.println("Paciente está com condições críticas? Digite sim ou nao: ");
        String critica = leia.nextLine();
        if (!critica.equalsIgnoreCase("sim")){
            System.out.println("Digite a idade do paciente: ");
            int idade = leia.nextInt();
            leia.nextLine();
            System.out.println("A paciente está grávida? Digite sim ou nao: ");
            String gravida = leia.nextLine();
            System.out.println("Paciente possuí alguma doença crônica? Digite sim ou nao: ");
            String doen = leia.nextLine();
            System.out.println("O paciente está com sintoma grave ou moderado?");
            String sint = leia.nextLine();
            if((idade>65 && sint.equalsIgnoreCase("grave"))||gravida.equalsIgnoreCase("sim")){
                System.out.println("Paciente com prioridade alta!");
            }
            else if (doen.equalsIgnoreCase("sim") && sint.equalsIgnoreCase("moderado")){
                System.out.println("Paciente com prioridade média!");
            }
            else {
                System.out.println("Paciente com prioridade baixa!");
            }
        }
        else {
            System.out.println("Paciente com prioridade máxima!");
        }
        leia.close();
    }
}
