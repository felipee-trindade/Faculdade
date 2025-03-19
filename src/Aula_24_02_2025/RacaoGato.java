package Aula_24_02_2025;

import java.util.Scanner;

public class RacaoGato {
    public static void main(String[] args) {

        /*Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos, 
        * para os quais fornece a quantidade de ração em gramas. A quantidade diária
        * de ração fornecida para cada gato é sempre a mesma. Crie um algoritmo que 
        * receba o peso do saco de ração e a quantidade de ração fornecida para cada 
        * gato, calcule e mostre quanto restará de ração no saco após cinco dias.  
        */
        Scanner teclado = new Scanner(System.in);

        int racao, dosagem, sobra;

        System.out.print("Digite o peso do saco em Kg: ");
        racao = teclado.nextInt();

        System.out.print("Digite o valor de ração para cada gato em gramas: ");
        dosagem = teclado.nextInt();

        racao = racao * 1000;
        dosagem = dosagem * 2 * 5;

        sobra = racao - dosagem;

        System.out.printf("%nTotal de ração comprada %d, dosagem por dia %d, sobrando %d %n%n", racao, dosagem/5, sobra);

        teclado.close();
    }
}
