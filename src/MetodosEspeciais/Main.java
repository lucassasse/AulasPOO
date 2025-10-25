package MetodosEspeciais;

public class Main {
    public static void main(String[] args) {
        MoldeCaneta canetinha = new MoldeCaneta();

        canetinha.setModelo("BIC");
        canetinha.setPonta(0.8);
        canetinha.statusDaCaneta();

        System.out.println("O modelo é: " + canetinha.getModelo() + " e a ponta é: " + canetinha.getPonta());

        MoldeCaneta canetaBasica = new MoldeCaneta();
        canetaBasica.statusDaCaneta();

        MoldeCaneta canetaRosaGrossa = new MoldeCaneta("Rosa", 2.7);
        canetaRosaGrossa.statusDaCaneta();
    }
}
