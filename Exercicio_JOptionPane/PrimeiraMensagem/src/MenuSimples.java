import javax.swing.JOptionPane;
public class MenuSimples {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu Simples - JOptionPane!");

        String opcoes[] = {"Java", "Python", "JavaScript"};

        String escolha = (String) JOptionPane.showInputDialog (null,"Escolha uma linguagem de programação: ", "Menu Simples", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog (null,"Linguagem Escolhida, "+escolha+" Bons Estudos!");
    }
}