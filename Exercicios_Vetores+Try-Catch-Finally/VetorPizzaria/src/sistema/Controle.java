package sistema;

public class Controle {
    public static String[] menu() {
        String[] menu = new String[7];
        menu [0] = "1. Pizza de Calabresa               R$60,00";
        menu [1] = "2. Pizza de Frango com Catupiry     R$65,00";
        menu [2] = "3. Pizza de Marguerita              R$55,00";
        menu [3] = "4. Pizza Portuguesa                 R$70,00";
        menu [4] = "5. Coca-cola                         R$8,00";
        menu [5] = "6. Guaraná                           R$7,00";
        menu [6] = "7. Fechar pedido";
        for (String item : menu) {
            System.out.println(item);
        }
        return menu;
    }
    public static Double[] valor(){
        Double[] valor = new Double[6];
        valor [0] = 60.00;
        valor [1] = 65.00;
        valor [2] = 55.00;
        valor [3] = 70.00;
        valor [4] = 8.00;
        valor [5] = 7.00;
        return valor;
    }
    public static double[] contasMesas = new double[12]; 
    public static String[] resumoPedidos = new String[12];
}
