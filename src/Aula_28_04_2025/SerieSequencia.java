package Aula_28_04_2025;

import java.util.Scanner;

public class SerieSequencia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int termo, contador = 1, primeiroTermo = 2, segundoTermo = 7, terceiroTermo = 3;


        System.out.print("Digite o número de termos desejados: ");
        termo = scan.nextInt();

        for(int i = 1; i <= termo; i++) {
            if (contador == 1) {
                System.out.println(primeiroTermo);
                primeiroTermo *= 2;
            }
            if (contador == 2) {
                System.out.println(segundoTermo);
                segundoTermo *= 3;
            }
            if (contador == 3) {
                System.out.println(terceiroTermo);
                terceiroTermo *= 4;
            }

            contador++;
            if (contador > 3) {
                contador = 1;
            }
        }
    }
}
