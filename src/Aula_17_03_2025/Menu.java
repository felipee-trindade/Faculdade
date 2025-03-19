package Aula_17_03_2025;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado;

        System.out.println("""
                **** Menu de Opções *****
                1. Somar dois números
                2. Raiz quadrada de um número
                3. Elevar um número a uma potência
                **** Digite a opção desejada ****
                """);

        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextDouble();
                resultado = num1 + num2;
                System.out.printf("Soma: %d + %d = %d%n%n", (int) num1, (int) num2, (int) resultado);
                break;
            case 2:
                System.out.print("Digite o número: ");
                num1 = scan.nextDouble();
                resultado = Math.sqrt(num1);
                System.out.printf("A raíz quadrada de %.1f é %.3f%n%n", num1, resultado);
                break;
            case 3:
                System.out.print("Digite a base: ");
                num1 = scan.nextDouble();
                System.out.print("Digite a potência: ");
                num2 = scan.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.printf("%d elevado á %d é %d%n%n", (int) num1, (int) num2, (int) resultado);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scan.close();
    }
}
