import javax.swing.JOptionPane;
public class Confirmacao {
    public static void main(String[] args) throws Exception {
        System.out.println("Confirmação - JOptionPane!");

        int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite um número: "));

        boolean confirmacao = JOptionPane.showConfirmDialog (null, "Você digitou o número: "+numero+". Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;

        if (confirmacao) {
            JOptionPane.showMessageDialog (null,"Você escolheu continuar!");
        }
        else {
            JOptionPane.showMessageDialog (null, "Você escolheu não continuar!");
        }
    }
}