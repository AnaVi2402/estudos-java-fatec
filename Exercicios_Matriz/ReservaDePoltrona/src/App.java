//Prcisa de ajustes para o cancelamento e troca de assentos, mas a estrutura geral do código está boa. O programa permite inserir informações sobre um ônibus, realizar reservas, trocar de assentos, cancelar reservas e mostrar um resumo econômico. Certifique-se de que as classes Lugares, Troca, Cancelamento e Resumo estejam implementadas corretamente para que o programa funcione como esperado.

import java.util.Scanner;
import onibus.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Reservas de ônibus---");
        System.out.println("Bem-vindo ao gerenciamento de reservas de ônibus!");
        System.out.println("Você gostaria de:");
        System.out.println("1 - Inserir informações sobre um ônibus.");
        System.out.println("2 - Sair");
        int opcao1 = sc.nextInt();
        sc.nextLine();

        String destino;
        String nomeMotorista;
        int numeroOnibus;
        double valorPassagem;
        String[][] reservado = new String[12][4];

        while (opcao1 != 2) {
            System.out.println("Digite qual o destino do ônibus: ");
            destino = sc.nextLine();
            System.out.println("Digite o nome do motorista: ");
            nomeMotorista = sc.nextLine();
            System.out.println("Digite o número do ônibus: ");
            numeroOnibus = sc.nextInt();
            System.out.println("Digite o valor da passagem: ");
            valorPassagem = sc.nextDouble();
            sc.nextLine();

            System.out.println("Segue os assentos disponíveis: ");
            String[][] assentos = Lugares.assentos();
            
            System.out.println("\nVocê deseja: \n1. Realizar uma reserva; \n2. Trocar de assento; \n3. Cancelar reserva; \n4. Finalizar e mostrar resumo econômico; \n5. Sair");
            int opcao2 = sc.nextInt();
            sc.nextLine();

            while (opcao2 != 5){
                switch (opcao2){

                    case 1 -> {
                        System.out.println("Digite o número da poltrona que deseja reservar: ");
                        String poltrona = sc.nextLine();
                        reservado = Lugares.reservado(assentos, poltrona);
                    }

                    case 2 -> {
                        System.out.println ("Digite o número da poltrona que deseja trocar: ");
                        String trocaPoltrona = sc.nextLine();
                        System.out.println ("Digite o número da poltrona que deseja reservar: ");
                        String novaPoltrona = sc.nextLine();
                        reservado = Troca.reservado(assentos,reservado, trocaPoltrona, novaPoltrona);
                    }

                    case 3 -> {
                        System.out.println ("Digite o número da poltrona que deseja cancelar: ");
                        String cancelarPoltrona = sc.nextLine();
                        reservado = Cancelamento.reservado(assentos, reservado, cancelarPoltrona);
                    }

                    case 4 -> {
                        System.out.println ("-----Resumo econômico-----");
                        System.out.println("Destino: " + destino);
                        System.out.println("Motorista: " + nomeMotorista);
                        System.out.println("Número do ônibus: " + numeroOnibus);
                        System.out.println("Valor da passagem: " + valorPassagem);
                        System.out.println("Assentos reservados: ");
                        Resumo.imprimir(reservado);

                        System.out.println("Total de assentos vendidos: " + Resumo.vendidos(reservado));
                        System.out.println("Total de assentos disponíveis: " + Resumo.disponiveis(reservado));
                        System.out.println("Lucro total: R$ "+ Resumo.vendidos(reservado)*valorPassagem);
                    }

                    default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }

                System.out.println("\nVocê deseja: \n1. Realizar uma reserva; \n2. Trocar de assento; \n3. Cancelar reserva; \n4. Finalizar e mostrar resumo econômico; \n5. Sair");
                opcao2 = sc.nextInt();
                sc.nextLine();
            }

            Resumo.imprimir(reservado);
            System.out.println("Você gostaria de:");
            System.out.println("1 - Inserir informações sobre um ônibus.");
            System.out.println("2 - Sair");
            opcao1 = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Programa finalizado!");
        sc.close();
    }
}
