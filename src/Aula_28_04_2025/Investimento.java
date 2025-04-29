package Aula_28_04_2025;

import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salarioCarlos, salarioJoao;
        int meses = 0;

        System.out.print("Digite o salario do Carlos: ");
        salarioCarlos = scan.nextDouble();

        salarioJoao = salarioCarlos / 3;

        for(int i = 1; salarioJoao < salarioCarlos; i++) {
            salarioCarlos *= 1.02;
            salarioJoao *= 1.05;
            meses++;
        }

        System.out.printf("""
                A quantidade de meses necessário para que o patrimônio de João iguale ou ultrapasse o de Carlos
                Meses: %d
                Salário do Carlos R$ %.2f
                Salário do João R$ %.2f
                """, meses, salarioCarlos, salarioJoao);

        scan.close();

    }
}
