//7- Construa um programa que classifique os filmes por idade segundo os critérios abaixo: 
//a. Idade < 10 → classificação Livre 
//b. Idade entre 10 e 13 → classificação 10+ 
//c. Idade entre 14 e 17 → classificação 14+ 
//d. Idade ≥ 18 → classificação 18+ 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        System.out.println("----CLASSIFICAÇÃO DE FILMES POR IDADE----");
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        String clas = "";

        if (idade< 10){
            clas = "classificação livre";
        }else if (idade >=10 && idade <= 13) {
            clas = "classificação 10+";
        }else if (idade >=14 && idade <= 17){
            clas = "classificação 14+";
        }
        else {
            clas = "classificação 18+";
        }
        System.out.println("Você pode assistir até os filme de "+clas+"!");
        leia.close();
    }
}
