package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        MoldeControle controleTV = new MoldeControle();
        controleTV.ligar();
        controleTV.maisVolume();
        controleTV.maisVolume();
        controleTV.abrirMenu();

        controleTV.play();
        controleTV.ligarMudo();
        controleTV.abrirMenu();

    }
}