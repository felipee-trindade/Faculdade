package Aula_28_04_2025;

public class AumentoSalarioAnual {
    public static void main(String[] args) {

        double salario = 1000, percentual = 0.015;

        for(int i = 1; i <= 15; i++) {
            salario *= (1 + percentual);
            percentual *= 2;
        }

        System.out.printf("O salário atual é de R$ %.2f%n", salario);
    }
}
