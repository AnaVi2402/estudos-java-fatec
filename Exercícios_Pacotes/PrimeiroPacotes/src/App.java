import saudacao.Matutino;
import saudacao.Noturno;
import saudacao.Vespertino;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Saudações a todos!");

        Matutino matutino = new Matutino();
        matutino.amanhecer();
        matutino.cafe();
        System.out.println("--------------------------------------");
        Vespertino vespertino = new Vespertino();
        vespertino.tarde();
        System.out.println("---------------------------------------");
        Noturno noturno = new Noturno();
        noturno.noite();
    }
}
