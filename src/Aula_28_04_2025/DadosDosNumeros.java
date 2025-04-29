package Aula_28_04_2025;

import java.util.Scanner;

public class DadosDosNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, maior = 0, menor = 0, totalSoma = 0, qtdPares = 0, qtdMultiploCinco = 0;
        double media;


        for(int i = 1; i < 15; i++) {
            System.out.print("Digite um valor: ");
            valor = scan.nextInt();
            if (i == 1) {
                maior = valor;
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            if(valor < menor) {
                menor = valor;
            }
            totalSoma += valor;
            if (valor % 2 ==0) {
                qtdPares++;
            }
            if (valor % 5 == 0) {
                qtdMultiploCinco++;
            }
        }

        media = totalSoma / 15;

        System.out.printf("""
                Maior número digitado: %d
                Menor número digitado: %d
                Média dos números digitados: %.2f
                Quantidade de números pares: %d
                Quantidade de números divisíveis por 5: %d
                """, maior, menor, media, qtdPares, qtdMultiploCinco);
    }
}

