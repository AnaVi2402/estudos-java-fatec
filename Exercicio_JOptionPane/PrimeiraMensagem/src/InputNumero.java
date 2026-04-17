import javax.swing.JOptionPane;
public class InputNumero {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada de número - JOptionPane!");

        int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog (null, "Você digitou o número: "+numero);
    }
}
