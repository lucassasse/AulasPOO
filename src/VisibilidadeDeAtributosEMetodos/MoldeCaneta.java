package VisibilidadeDeAtributosEMetodos;

public class MoldeCaneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não é possível escrever com a caneta tampada");
        }
        else{
            System.out.println("Carga atual da caneta é: " + this.carga);
            System.out.println("Escrevendo... Rabiscando...");
            this.carga = this.carga - 5;
            System.out.println("Carga atual da caneta depois do uso é: " + this.carga);
        }
    }

    private void tampar(){
        this.tampada = true;
    }

    private void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Uma caneta " + this.cor);
        if(this.tampada == true){
            System.out.println("A caneta está tampada");
        }
        else{
            System.out.println("A caneta está destampada");
        }
        System.out.println("Modelo: " + this.modelo);
    }

    //Observação:
        // Posso definir um atributo como privado
        // Criar um metodo publico que altera o atributo
        // Chamar o atributo para metodo publico e, atraves dele, alterar o atributo

    private double tamanho = 15;

    public void alterarTamanho(int novoTamanho){
        this.tamanho = novoTamanho;
    }
}
