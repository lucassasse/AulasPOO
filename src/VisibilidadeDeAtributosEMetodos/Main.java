package VisibilidadeDeAtributosEMetodos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MoldeCaneta canetaVermelhaPontaFina = new MoldeCaneta();

        canetaVermelhaPontaFina.cor = "Vermelha";
        // canetaVermelhaPontaFina.ponta = 0.5f; // privado
        canetaVermelhaPontaFina.carga = 90;
        canetaVermelhaPontaFina.tampada = false;

        canetaVermelhaPontaFina.status();

        canetaVermelhaPontaFina.tampada = true;
        canetaVermelhaPontaFina.status();

        canetaVermelhaPontaFina.rabiscar();
        // canetaVermelhaPontaFina.destampar(); // privado
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();



        MoldeCaneta canetaAzulPontaGrossa = new MoldeCaneta();

        canetaAzulPontaGrossa.modelo = "Comum";
        canetaAzulPontaGrossa.cor = "Azul";
        // canetaAzulPontaGrossa.ponta = 1.5f; // privado
        canetaAzulPontaGrossa.carga = 45;
        canetaAzulPontaGrossa.tampada = true;

        canetaAzulPontaGrossa.status();
    }
}