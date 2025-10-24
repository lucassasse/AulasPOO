package RevisaoDeLogica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ========== DECLARAÇÃO DE VARIÁVEIS | TIPOS DE VARIÁVEIS ==========*/

        // para declarar uma variável em Java, preciso dizer de qual tipo ela será
        // tipos primitivos
        int aa = 1;
        double bb = 2.0;
        char cc = '9';
        boolean dd = true;

        // tipos compostos
        String ee = "um conjunto de caracteres";

        int[] listaDeNumeros = new int[5]; // array = tipo + nomeDaVariavel + instanciação + tamanho
        // Atribui valores
        listaDeNumeros[0] = 10;
        listaDeNumeros[1] = 20;
        listaDeNumeros[2] = 30;
        listaDeNumeros[3] = 40;
        listaDeNumeros[4] = 50;

        // lembrar de importar (início do código) para poder utilizar: import java.util.ArrayList;
        ArrayList<String> listaDeFrutas = new ArrayList<>(); // ArrayList = declaração<tipoDosValores> + nomeDaVariavel + instanciação
        listaDeFrutas.add("Maçã"); // adicionando valores dentro do ArrayList
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");

        /* ========== INPUT | OUTPUT DE DADOS ==========*/

        // para exibir dados no console:
        System.out.print("print, exibe os dados mas não pula a linha");
        System.out.println("println exibe os dados e pula a linha");

        // para capturar dados pelo console:
        // 1ª - importar o Scanner no início do código: import java.util.Scanner;
        // instanciar o leitor do terminal
        Scanner entrada = new Scanner(System.in); // tipo + nomeDaVariavel + instanciação
        int g;
        System.out.print("Digite um valor para 'g': ");
        // lê o valor digitado e armazena em 'g'
        g = entrada.nextInt(); // neste momento, o valor digitado foi guardado em 'g' e pode ser utilizado de qualquer forma que quiser
        System.out.println("Agora o valor de 'g' é: " + g);

        /* ========== OPERADORES ==========*/

        int num1 = 15;
        int num2 = 6;

        // Soma (+) - Atenção: Pode ser Adição OU Concatenação
        int num3 = num1 + num2; // num3 será 21

        // Subtração (-)
        int num4 = num1 - num2; // num4 será 9

        // Multiplicação (*)
        int num5 = num1 * num2; // num5 será 90

        // Divisão (/)
        double num6 = num1 / num2; // num6 será 2.5

        // Módulo (%)
        double num7 = num1 % num2; // num7 será 3
        // muito utilizado para verificar se um numero é par ou não, exemplo:
        if (num1 % 2 == 0) {
            System.out.println("O número " + num1 + " é PAR.");
        } else {
            System.out.println("O número " + num1 + " é ÍMPAR.");
        }


        int a = 5;
        int b = 3;

        // Igual (== OU ===) = Atenção: apenas um "=" serve para atribuição
        // a == b ? // false, pois 5 não é igual a 3

        // Diferente (!=)
        // a != b ? // true, pois 5 é diferente de 3

        // Maior que (>)
        //  a > b ? // true, pois 5 é maior que 3

        // Menor que (<)
        // a < b ? // false, pois 5 não é menor que 3

        // Maior ou igual a (>=)
        // a >= b ? // true, pois 5 é maior ou igual a 3

        // Menor ou igual a (<=)
        // a <= b ? // false, pois 5 não é menor ou igual a 3


        int c = 10;
        int d = 20;

        // E (and - &)
        // Retorna true se as duas expressões forem verdadeiras
        // (c < d) && (d > 5)   =   true && true   =   true

        // OU (or - ||)
        // Retorna true se pelo menos uma das expressões for verdadeira
        // (c > d) || (d == 20)   =   false || true   =   true

        // NÃO (not - !)
        // Inverte o valor lógico da expressão
        // !(c < d)   =   !(true)   =   false


        /* ========== ESTRUTURAS DE CONTROLE ==========*/

        int valorDeTeste = 10;

        if(valorDeTeste < 10){
            System.out.println("entrou no if");
        }
        else if(valorDeTeste > 10){
            System.out.println("entrou no else if");
        }
        else{
            System.out.println("entrou no else");
        }


        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido");
        }


        // for - Repete i vezes
        for(int i = 0; i < 10; i++){
            System.out.println("Contagem: " + i);
        }

        // while - Verifica primeiro e, se a condição for verdadeira, executa/entra
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }

        // do...while - Executa primeiro e, depois verifica se a condição é verdadeira e, se for, executa/entra novamente
        int numeroVariavel = 1;

        do {
            System.out.println("Número: " + numeroVariavel );
            numeroVariavel ++;
        } while (numeroVariavel <= 5);


        // break - Interrompe imediatamente a execução do laço ou switch mais próximo.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Sai do laço quando i == 5
            }
            System.out.println("i = " + i);
        }
        //Não irá imprimir o 5 e próximos


        //continue - Pula para a próxima iteração do laço, ignorando o restante do código dentro dele.
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula o número 3
            }
            System.out.println("Número: " + i);
        }
        //Não imprime o 3, mas continua no loop


        //return - Encerra a execução de uma função e, opcionalmente, retorna um valor.
        /*
        public static void main(String[] args) {
            System.out.println("Soma: " + somar(3, 4));
            somarSemRetorno(3, 4); // apenas chama o metodo
        }

        public static int somar(int a, int b) {
            return a + b; // Retorna o resultado da soma
        }

        public static void somarSemRetorno(int a, int b) {
            int soma = a + b;
            return; // Retorna "void" (opcional)
        }
        */


        /* ========== ESTRUTURAS DE DADOS ==========*/

        // vetor: similar ao array
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}