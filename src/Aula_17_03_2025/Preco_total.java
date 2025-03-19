package Aula_17_03_2025;

import java.util.Scanner;

public class Preco_total {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String codigo;
        int qtdPecas;
        double valorTotal = 0;

        System.out.print("Digite o código da peça: ");
        codigo = scan.next().toUpperCase();
        System.out.print("Digite a quantidade de peças: ");
        qtdPecas = scan.nextInt();

        switch (codigo) {
            case "A001" -> valorTotal = 7.5 * qtdPecas;
            case "A002" -> valorTotal = 9.9 * qtdPecas;
            case "A003" -> valorTotal = 14 * qtdPecas;
            case "A004" -> valorTotal = 19.99 * qtdPecas;
            default -> {
                System.out.println("\nCódigo inválido!\n");
                System.exit(0);
            }
        }

        System.out.printf("%nValor total da compra: %.2f%n%n", valorTotal);


        scan.close();
    }
}
