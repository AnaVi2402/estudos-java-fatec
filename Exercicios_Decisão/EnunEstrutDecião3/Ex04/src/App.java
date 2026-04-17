//4- Construa um programa que permita realizar a avaliação de funcionários segundo os critérios abaixo: 
// a. Nota de desempenho ≥ 90 → excelente 
// b. Nota entre 70 e 89 → bom 
// c. Nota entre 50 e 69 → regular 
// d. Nota < 50 → insatisfatório 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----AVALIAÇÃO DE FUNCIONÁRIO----");
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um número de 1 a 100, para a avaliação do serviços do funcionário, sendo: \n - Maior que 90, excelente; \n - Entre 70 e 89, bom; \n - Entre 50 e 69, regular, e; \n - Menor que 50, insatisfatório.");
        int nota = leia.nextInt();

        if (nota >= 90){
            System.out.println("Obrigada pela avaliação do nosso funcionário como excelente!");
        }
        else if (nota >= 70 && nota <= 89){
            System.out.println("Obrigada pela avaliação do nosso funcionário como bom, esperamos melhorar em um próximo atendimento!");
        }
        else if (nota >= 50 && nota <= 69){
            System.out.println("Obrigada pela avaliação do nosso funcionário como regular, esperamos suprear sua expectativa em uma próxima oportunidade!");
        }
        else {
            System.out.println("Obrigada pela avaliação do nosso funcionário como insatisfatório, sentimos muito que não tenhamos atendido sua expectativa. Caso se sinta a vontade, nos procure para explicar o que aconteceu.");
        }
        leia.close();
    }
}
