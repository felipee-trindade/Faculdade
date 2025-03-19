package Aula_24_02_2025;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double salario;

        System.out.print("Digite o salário bruto: ");
        salario = teclado.nextDouble();

        salario = salario * 1.10;
        salario = salario * 0.85;

        System.out.printf("%nSalário liquido: %7.2f%n%n", salario);

        teclado.close();
    }
}
