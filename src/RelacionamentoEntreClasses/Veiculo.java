package RelacionamentoEntreClasses;

public class Veiculo {
    // Atributos
    private String modelo;
    private String fabricante;
    private int ano;
    private double potencia;
    private double peso;
    private String categoria;
    private int corridasVencidas;
    private int corridasPerdidas;
    private int corridasEmpatadas;

    // Metodo Especial: Construtor
    public Veiculo(String mo, String fa, int an, double po, double pe, int v, int d, int e) {
        modelo = mo;
        fabricante = fa;
        ano = an;
        potencia = po;
        setPeso(pe);
        corridasVencidas = v;
        corridasPerdidas = d;
        corridasEmpatadas = e;
    }

    // Metodos getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 500) {
            categoria = "Inválida";
        } else if (peso <= 1200) {
            categoria = "Leve";
        } else if (peso <= 2000) {
            categoria = "Médio";
        } else if (peso <= 3500) {
            categoria = "Pesado";
        } else {
            categoria = "Inválida";
        }
    }

    public int getCorridasVencidas() {
        return corridasVencidas;
    }

    public void setCorridasVencidas(int corridasVencidas) {
        this.corridasVencidas = corridasVencidas;
    }

    public int getCorridasPerdidas() {
        return corridasPerdidas;
    }

    public void setCorridasPerdidas(int corridasPerdidas) {
        this.corridasPerdidas = corridasPerdidas;
    }

    public int getCorridasEmpatadas() {
        return corridasEmpatadas;
    }

    public void setCorridasEmpatadas(int corridasEmpatadas) {
        this.corridasEmpatadas = corridasEmpatadas;
    }

    // Metodos Especial: Publicos Gerais
    public void apresentar() {
        System.out.println("=== DADOS DO VEÍCULO ===");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Ano: " + getAno());
        System.out.println("Potencia: " + getPotencia() + " CVs");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getCorridasVencidas());
        System.out.println("Derrotas: " + getCorridasPerdidas());
        System.out.println("Empates: " + getCorridasEmpatadas());
        System.out.println("==========================");
    }

    public void status() {
        System.out.println(getModelo() + " é um veículo da categoria " + getCategoria());
        System.out.println(getCorridasVencidas() + " vitórias / " + getCorridasPerdidas() +
                " derrotas / " + getCorridasEmpatadas() + " empates");
    }

    public void vencerCorrida() {
        setCorridasVencidas(getCorridasVencidas() + 1);
    }

    public void perderCorrida() {
        setCorridasPerdidas(getCorridasPerdidas() + 1);
    }

    public void empatarCorrida() {
        setCorridasEmpatadas(getCorridasEmpatadas() + 1);
    }
}
