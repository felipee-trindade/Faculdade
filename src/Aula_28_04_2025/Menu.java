package Aula_28_04_2025;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int opcao = 0;        

        do {

            System.out.println("""
                ----- Menu de opções -----
                1. Imposto
                2. Novo salário
                3. Classificação
                4. Finalizar o programa
                Digite a opção desejada.
                -----------------------------------
                """);

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    double salario = 0, imposto, percentual;
                    System.out.print("\nDigite o salário do funcionário: ");
                    salario = scan.nextDouble();
                    if (salario <= 1500) {
                        percentual = 0.05;
                        imposto = salario * percentual;
                    }
                    else if (salario <= 3000) {
                        percentual = 0.1;
                        imposto = salario * percentual;
                    }
                    else {
                        percentual = 0.15;
                        imposto = salario * percentual;
                    }
                    System.out.printf("""

                            ----- Dados -----
                            Salario - R$ %.2f 
                            Percentual - %.2f
                            Valor Imposto - R$ %.2f
                            -----------------

                            """,salario, percentual, imposto);
                    break;
                case 2:
                    System.out.print("\nDigite o salário do funcionário: ");
                    salario = scan.nextDouble();
                    if (salario > 4500) {
                        salario += 250;
                    }
                    else if (salario > 3000) {
                        salario += 200;
                    }
                    else if (salario > 2000) {
                        salario += 150;
                    }
                    else {
                        salario += 130;
                    }
                    System.out.printf("Novo Salário - R$ %.2f%n%n", salario);
                    break;
                case 3:
                    System.out.print("\nDigite o salário do funcionário: ");
                    salario = scan.nextDouble();
                    if (salario > 3000) {
                        System.out.println("Bem remunerado!\n");
                    }
                    else {
                        System.out.println("Mal Remunerado\n");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa...\n");
                    return;
                default:
                    System.out.println("Opção inválida...\n");
                    break;
            }
        } while (opcao != 4);

        System.out.print("Digite a nova opção desejada: ");
        opcao = scan.nextInt();

        scan.close();
    }
}
