package Aula_28_04_2025;

import java.util.Scanner;

public class SomaMultiploCincoTermosIndeterminados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int PrimeiroTermo, UltimoTermo;

        System.out.print("Digite o primeiro termo: ");
        PrimeiroTermo = scan.nextInt();
        System.out.print("Digite o último termo: ");
        UltimoTermo = scan.nextInt();

        if(PrimeiroTermo > UltimoTermo) {
            System.out.println("Inválido");
            System.out.println("O primeiro termo não pode ser maior que o último termo...");
            System.err.println();
        }

        SomarTermos(PrimeiroTermo, UltimoTermo);

        scan.close();
    }

    public static void SomarTermos(int PrimeiroTermo, int UltimoTermo) {
        int total = 0;

        for (int i = PrimeiroTermo * 5; i <= 5 * UltimoTermo; i += 5) {
            total += i;
        }

        System.out.println("A soma dos dos termos é: " + total);
    }
}
