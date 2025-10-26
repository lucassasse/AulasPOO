package RelacionamentoEntreClasses;
import java.util.concurrent.ThreadLocalRandom;

public class Corrida {
    // agregação = tem 1 (uma Classe, tem outra Classe)
    // o tipo do parâmetro é a Classe
    private Veiculo desafiante;
    private Veiculo desafiado;
    private int rodadas;
    private boolean corridaAprovada;

    // regras (criatividade...)
    // a) somente veículos da mesma categoria de potencia podem competir entre sí
    // b) não é possível iniciar uma corida com apenas um veículo
    // c) o desafiante e o desafiado devem ser diferentes
    // d) únicos resultados possíveis: um vitorioso OU empate
    public void marcarCorrida(Veiculo desafiante, Veiculo desafiado){
        // .getCategoria() é um metodo da Classe Veiculo
        // como estamos usando um objeto dessa Classe, podemos utilizar seus métodos e atributos
        if(desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado){
            this.corridaAprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        }
        else {
            this.corridaAprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void correr(){
        if(this.corridaAprovada){
            desafiante.apresentar();
            desafiado.apresentar();
            int vencedor = ThreadLocalRandom.current().nextInt(0, 3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiante.empatarCorrida();
                    desafiado.empatarCorrida();
                    break;
                case 1:
                    System.out.println("Vencedor: " + desafiante.getModelo());
                    desafiante.vencerCorrida();
                    desafiado.perderCorrida();
                    break;
                case 2:
                    System.out.println("Vencedor: " + desafiado.getModelo());
                    desafiante.perderCorrida();
                    desafiado.vencerCorrida();
                    break;
            }
        }
        else{
            System.out.println("Sentimos muito, mas a corrida não poderá acontecer.");
        }
    }

    // posso utilizar um objeto também como parâmetro, uma vez que funciona como um 'tipo' (int, double...)
    public void setDesafiante(Veiculo dd){
        this.desafiante = dd;
    }

    public void setDesafiado(Veiculo dd){
        this.desafiado = dd;
    }

    public Veiculo getDesafiante() {
        return desafiante;
    }

    public Veiculo getDesafiado() {
        return desafiado;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    public boolean isCorridaAprovada() {
        return corridaAprovada;
    }

    public void setCorridaAprovada(boolean corridaAprovada) {
        this.corridaAprovada = corridaAprovada;
    }
}
