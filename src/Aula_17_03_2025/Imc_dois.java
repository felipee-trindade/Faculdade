package Aula_17_03_2025;

import java.util.Scanner;

public class Imc_dois {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double peso, altura, imc;
        String mensagem;

        System.out.print("Digite o peso: ");
        peso = scan.nextDouble();
        System.out.print("Digite a altura: ");
        altura = scan.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc <= 16) {
            mensagem = "Magreza Severa";
        }
        else if (imc < 17) {
            mensagem = "Magreza Moderada";
        }
        else if (imc < 18.5) {
            mensagem = "Magreza Leve";
        }
        else if (imc < 25) {
            mensagem = "Normal";
        }
        else if (imc < 30) {
            mensagem = "Obesidade Leve";
        }
        else if (imc < 40) {
            mensagem = "Obesidade Severa";
        }
        else {
            mensagem = "Obesidade Mórbida";
        }

        System.out.println(mensagem);

        scan.close();
    }
}
