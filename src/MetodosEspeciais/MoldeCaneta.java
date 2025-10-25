package MetodosEspeciais;


public class MoldeCaneta {

    public String modelo;
    private double ponta;
    private boolean tampada;

    // métodos construtores geralmente ficam logo após a definição dos atributos
    // tem o mesmo nome que o nome da Classe
    // não possui retorno
    // não possui parâmetros, então será utilizado sempre que uma nova caneta for criada
    public MoldeCaneta(){
        this.tampar();
        this.modelo = "biczinha";
        this.ponta = 0.5;
    }

    // metodo construtor esperando parametros
    public MoldeCaneta(String b, double p){
        this.tampar();
        this.modelo = b;
        this.ponta = p;
    }

    // métodos getters e setters ficam logo abaixo
    // não mais void como retorno. Utilizo String pois agora há um retorno e é uma String
    public String getModelo(){
        return this.modelo;
    }

    // metodos set podem ou não possuir um retorno
    public void setModelo(String m){
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double p){
        this.ponta = p;
    }

    // como possuo métodos específicos para modificar o atributo "tampada", somente preciso o getTampada
    public boolean getTampada() {
        return this.tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void statusDaCaneta(){
        System.out.println("Informações da caneta:");
        // utilizo os metodos especiais já dentro da propria classe, mantendo o padrão, segurança e organização
        System.out.println("O modelo é: " + this.getModelo());
        System.out.println("O tamanho da ponta é: " + this.getPonta());
        System.out.println("A caneta está tampada: " + this.getTampada());
    }

}
