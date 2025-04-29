package Aula_28_04_2025;

import java.util.Scanner;

public class MaiorMenorPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, maior = 0, menor = 0;

        System.out.print("Digite um número: ");
        valor = scan.nextInt();

        if (valor < 0) {
            System.out.println("Nenhum valor positivo foi digitado...");
            scan.close();
            return;
        }

        maior = valor;
        menor = valor;

        while(valor >= 0){
            System.out.print("Digite um número: ");
            valor = scan.nextInt();
            if (valor > maior) {
                maior = valor;
            }
            if (valor >= 0) {
                if(valor < menor) {
                    menor = valor;
                }
            }
        }

        System.out.printf("Maior valor %d e Menor valor %d%n%n", maior, menor);

        scan.close();
    }
}
