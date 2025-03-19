package Aula_17_03_2025;

import java.util.Scanner;

public class Produto_imposto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int codProduto, codPaisOrigem;
        double pesoProduto, valorImposto = 0, valorProduto = 0, valorProdutoComImposto = 0;

        System.out.print("Digite o código do produto: ");
        codProduto = scan.nextInt();
        System.out.print("Digite o peso do produto em Kg: ");
        pesoProduto = scan.nextDouble();
        System.out.print("Digite o código do país de origem: ");
        codPaisOrigem = scan.nextInt();

        pesoProduto = 1000 * pesoProduto;

        switch (codProduto) {
            case 1, 2, 3, 4 -> valorProduto = 10 * pesoProduto;
            case 5, 6, 7 -> valorProduto = 25 * pesoProduto;
            case 8, 9, 10 -> valorProduto = 35 * pesoProduto;
        }

        if (codPaisOrigem == 2) {
            valorImposto = 0.15 * valorProduto;
        }
        else if (codPaisOrigem == 3) {
            valorImposto = 0.25 * valorProduto;
        }

        valorProdutoComImposto = valorProduto + valorImposto;

        System.out.printf("""

                *=========================================================*

                Peso do produto: %.0f gramas
                Preço total do produto comprado: R$ %.2f
                Valor do imposto: R$ %.2f
                Valor total (preço total do produto + imposto): R$ %.2f

                *=========================================================*

                """, pesoProduto, valorProduto, valorImposto, valorProdutoComImposto);

        scan.close();

    }
}
