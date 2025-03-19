package Aula_24_02_2025;

import java.util.Scanner;

public class TrocaValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int valor1, valor2;
        int numero1, numero2, auxiliar;

        System.out.print("Digite o primeiro valor: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = teclado.nextInt();

        //Armazenando em variáveis distintas
        numero1 = valor1;
        numero2 = valor2;

        //Realizando a troca de valores entre as variáveis
        auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;

        System.out.printf("%nValor da variável 1: %d | Valor da variável 2: %d%n%n", numero1, numero2);

        teclado.close();
    }
}
