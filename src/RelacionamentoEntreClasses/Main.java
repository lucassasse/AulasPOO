package RelacionamentoEntreClasses;

public class Main {
    public static void main(String[] args) {
        // Criando (instanciando) alguns veículos (forma simples)
        //Veiculo v0 = new Veiculo("Civic", "Honda", 2022, 150, 1250, 5, 2, 1);
        //Veiculo v1 = new Veiculo("Uno", "Fiat", 2010, 1500, 950, 2, 4, 3);
        //Veiculo v2 = new Veiculo("Caminhão 2428", "Mercedes-Benz", 2019, 640, 3200, 8, 1, 0);

        // Criando (instanciando) alguns veículos (com vetores)
        Veiculo v[] = new Veiculo[3];
        v[0] = new Veiculo("Civic", "Honda", 2022, 150, 1500, 5, 2, 1);
        v[1] = new Veiculo("Uno", "Fiat", 2010, 1500, 1221, 2, 4, 3);
        v[2] = new Veiculo("Caminhão 2428", "Mercedes-Benz", 2019, 640, 3200, 8, 1, 0);

//      parte 01

//      // Apresentando os veículos
//      v[0].apresentar();
//      v[1].apresentar();
//      v[2].apresentar();
//
//      System.out.println("\n=== SITUAÇÃO INICIAL ===");
//        v[0].status();
//        v[1].status();
//        v[2].status();
//
//        // Simulando corridas
//        System.out.println("\n=== RESULTADOS DAS CORRIDAS ===");
//        v[0].vencerCorrida();
//        v[1].perderCorrida();
//        v[2].empatarCorrida();
//
//        // Exibindo status atualizado
//        System.out.println("\n=== STATUS ATUALIZADO ===");
//        v[0].status();
//        v[1].status();
//        v[2].status();

        // parte 02

        // agora, além de instanciar objetos da Classe Veiculo...
        // posso também instanciar e utilizar objetos da Classe Correr!
        Corrida topRace001 = new Corrida();
        topRace001.marcarCorrida(v[0], v[1]);
        topRace001.correr();

        v[0].status();
        v[1].status();
    }
}
