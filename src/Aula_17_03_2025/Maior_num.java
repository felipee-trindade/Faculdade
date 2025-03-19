package Aula_17_03_2025;

import java.util.Scanner;

public class Maior_num {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior%n%n", num1);
        }
        else if (num1 < num2) {
            System.out.printf("O número %d é maior%n%n", num2);
        }
        else {
            System.out.printf("Os números %d e %d são iguais%n%n", num1, num2);
        }

        scan.close();

    }
}
