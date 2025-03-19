package Aula_24_02_2025;

import java.util.Scanner;

public class EquacaoSegundoGrau2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, delta;
        double raiz1, raiz2;

        System.out.print("Digite o valor a: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor b: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor c: ");
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);

        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("%nOs valores das raízes são: Raiz 1: %.2f | Raíz 2: %.2f%n%n", raiz1, raiz2);

        teclado.close();
    }
}
