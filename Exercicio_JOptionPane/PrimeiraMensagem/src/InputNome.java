import javax.swing.JOptionPane;
public class InputNome {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada do Nome - JOptionPane!");

        String nome = JOptionPane.showInputDialog ("Digite seu nome: ");
        JOptionPane.showMessageDialog (null, "Olá, "+nome+"! Bem-vindo(a) ao Java!");
    }
}
