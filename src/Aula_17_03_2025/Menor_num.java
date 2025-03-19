package Aula_17_03_2025;

import java.util.Scanner;

public class Menor_num {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, menor;

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextInt();

        menor = num1;

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (menor > num2) {
            menor = num2;
        }

        System.out.print("Digite o terceiro número: ");
        num3 = scan.nextInt();

        if (menor > num3) {
            menor = num3;
        }

        System.out.printf("O menor número é o %d%n%n", menor);

        scan.close();
    }
}
