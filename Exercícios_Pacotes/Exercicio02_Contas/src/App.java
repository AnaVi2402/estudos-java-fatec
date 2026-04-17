import Contas.ContaConjunta;
import Contas.ContaCorrente;
import Contas.ContaPagamentoDigital;
import Contas.ContaPoupanca;
import Contas.ContaSalario;
import Contas.ContaUniversitaria; 

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---CONTAS---\n\n Conheça agora quais são os tipos de contas que existe!\n");
        ContaCorrente corrente = new ContaCorrente();
        corrente.conta1();
        corrente.finalidade();
        corrente.caracteristicas();
        System.out.println("-------------------------------\n");
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.conta2();
        poupanca.finalidade();
        poupanca.caracteristicas();
        System.out.println("-------------------------------\n");
        ContaPagamentoDigital pagamento = new ContaPagamentoDigital();
        pagamento.conta3();
        pagamento.finalidade();
        pagamento.caracteristicas();
        System.out.println("-------------------------------\n");
        ContaSalario salario = new ContaSalario();
        salario.conta4();
        salario.finalidade();
        salario.caracteristicas();
        System.out.println("-------------------------------\n");
        ContaConjunta conjunta = new ContaConjunta();
        conjunta.conta5();
        conjunta.finalidade();
        conjunta.caracteristicas();
        System.out.println("-------------------------------\n");
        ContaUniversitaria universitaria = new ContaUniversitaria();
        universitaria.conta6();
        universitaria.finalidade();
        universitaria.caracteristicas();
        System.out.println("-------------------------------\n");
    }
}
