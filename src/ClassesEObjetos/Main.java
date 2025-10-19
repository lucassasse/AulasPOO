package ClassesEObjetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //criando uma caneta a partir do molde
        MoldeCaneta canetaVermelhaPontaFina = new MoldeCaneta();

        //adicionando as propriedades/ ATRIBUTOS
        canetaVermelhaPontaFina.cor = "Vermelha";
        canetaVermelhaPontaFina.ponta = 0.5f;
        canetaVermelhaPontaFina.carga = 90;
        canetaVermelhaPontaFina.tampada = false;

        //exibindo status // METODOS
        canetaVermelhaPontaFina.status();

        //mudando o estado e exibindo novamente // Atributo + Metodo
        canetaVermelhaPontaFina.tampada = true;
        canetaVermelhaPontaFina.status();

        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.destampar();
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();


        //criando outra caneta a partir do molde
        MoldeCaneta canetaAzulPontaGrossa = new MoldeCaneta();

        //adicionando as propriedades/ ATRIBUTOS
        canetaAzulPontaGrossa.modelo = "Comum";
        canetaAzulPontaGrossa.cor = "Azul";
        canetaAzulPontaGrossa.ponta = 1.5f;
        canetaAzulPontaGrossa.carga = 45;
        canetaAzulPontaGrossa.tampada = true;

        //exibindo status // METODOS
        canetaAzulPontaGrossa.status();
    }
}