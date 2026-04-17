import javax.swing.JOptionPane;
public class atividade01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Confirmação - JOptionPane!");

        String input = JOptionPane.showInputDialog ("Digite o salário: ");
        double salario = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog (null, "O salário é: "+salario+". Digite o valor do acréscimo: ");
        double acrescimo = Double.parseDouble(input2);
        String sexo = JOptionPane.showInputDialog ("Digite seu sexo com letras");
    }
}