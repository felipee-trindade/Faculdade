package Aula_28_04_2025;

import java.util.Scanner;

public class SomaQuantidade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor, totalSoma = 0, qtdNegativos = 0;

        do {
            System.out.print("Digite um valor: ");
            valor = scan.nextInt();

            if(valor >= 0) {
                totalSoma += valor;
            }
            else {
                qtdNegativos++;
            }
            
        } while (valor != 0);

        System.out.printf("""
                A soma dos números positivos: %d
                A quantidade de números negativos: %d 
                """, totalSoma, qtdNegativos);

        scan.close();

    }
}
