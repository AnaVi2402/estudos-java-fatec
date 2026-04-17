import Passaros.DiferencaPassaroAve;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---CONHEÇA ALGUNS PÁSSAROS---\n");
        DiferencaPassaroAve passaro = new DiferencaPassaroAve();
        passaro.diferenca();
        System.out.println("\nAgora veja abaixo, alguns pássaros mais comuns no Brasil e suas características: \n");
        Passaros.BemTeVi bemtevi = new Passaros.BemTeVi();
        bemtevi.passaro1();
        bemtevi.nomeCientifico();
        bemtevi.caracteristicas();
        bemtevi.habitos();
        System.out.println("-------------------------------\n");
        Passaros.Canarinho canarinho = new Passaros.Canarinho();
        canarinho.passaro2();
        canarinho.nomeCientifico();
        canarinho.caracteristicas();
        canarinho.habitos();
        System.out.println ("-------------------------------\n");
        Passaros.JoaoDeBarro joao = new Passaros.JoaoDeBarro();
        joao.passaro3();
        joao.nomeCientifico();
        joao.caracteristicas();
        joao.habitos();
        System.out.println ("-------------------------------\n");
        Passaros.Pardal pardal = new Passaros.Pardal();
        pardal.passaro4();
        pardal.nomeCientifico();
        pardal.caracteristicas();
        pardal.habitos();
    }
}
