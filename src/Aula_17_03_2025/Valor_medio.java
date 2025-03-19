package Aula_17_03_2025;

import java.util.Scanner;

public class Valor_medio {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num1, num2, num3;

    System.out.print("Digite o primeiro número: ");
    num1 = scan.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = scan.nextInt();
    System.out.print("Digite o terceiro número: ");
    num3 = scan.nextInt();

    if (num3 >= num1 && num3 <= num2) {
        System.out.printf("%nO número %d está entre os números %d e %d %n%n", num3, num1, num2);
    }
    else if (num3 >= num2 && num3 <= num1) {
        System.out.printf("%nO número %d está entre os números %d e %d %n%n", num3, num2, num1);
    }
    else {
        System.out.printf("%nO valor %d não se encontra entre os valores %d e %d %n%n", num3, num1, num2);
    }

    scan.close();
}
}
