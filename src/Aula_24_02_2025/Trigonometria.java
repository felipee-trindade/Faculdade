package Aula_24_02_2025;

import java.util.Scanner;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double catetoAdjacente, catetoOposto, hipotenusa;

        System.out.print("Digite o valor do cateto adjacente: ");
        catetoAdjacente = teclado.nextDouble();
        System.out.print("Digite o valor do cateto oposto: ");
        catetoOposto = teclado.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));

        System.out.printf("%nO valor da hipotenusa é %.1f%n%n", hipotenusa);

        teclado.close();
    }
}
