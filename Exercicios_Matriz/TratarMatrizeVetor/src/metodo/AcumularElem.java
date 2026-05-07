package metodo;

public class AcumularElem {
    public static void acumulaElemento(int valor, int[] vetorRepetidos) {
        switch (valor) {
            case 1:
                vetorRepetidos[0] = vetorRepetidos[0] + 1;
                break;
            case 2:
                vetorRepetidos[1] = vetorRepetidos[1] + 1;
                break;
            case 3:
                vetorRepetidos[2] = vetorRepetidos[2] + 1;
                break;
            case 4:
                vetorRepetidos[3] = vetorRepetidos[3] + 1;
                break;
            case 5:
                vetorRepetidos[4] = vetorRepetidos[4] + 1;
                break;
            default:
                break;
        }
    }
}
