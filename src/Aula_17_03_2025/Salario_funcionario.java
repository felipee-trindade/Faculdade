package Aula_17_03_2025;

import java.util.Scanner;

public class Salario_funcionario {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double salario;

        System.out.print("Digite o salário do funcionário: ");
        salario = scan.nextDouble();

        if (salario <= 2000) {
            salario *= 1.1;
            salario += 350;
        }
        else if (salario <= 3000) {
            salario *= 1.08;
            if (salario <= 2500) {
                salario += 350;
            }
            else {
                salario += 300;
            }
        }
        else {
            salario *= 1.05;
            salario += 300;
        }

        System.out.printf("%nNovo salário: %.2f%n%n", salario);
   
        scan.close();
    }
}
