package Aula_28_04_2025;

import java.util.Scanner;

public class SomaTermoIndeterminado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int termo, total = 0;

        System.out.print("Digite até que termo deseja somar: ");
        termo = scan.nextInt();

        for (int i = 1; i <= termo; i++) {
            total += i;
        }

        System.out.println("A soma total dos termos é " + total);

        scan.close();
    }
}
