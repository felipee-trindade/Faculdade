package Aula_28_04_2025;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double nota;

        System.out.print("Digite a nota do aluno: ");
        nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("\nNota inválida...");
            System.out.print("Digite a nota do aluno: ");
            nota = scan.nextDouble();
        }

        if (nota >= 6) {
            System.out.println("Aprovado!!");
        }
        else if (nota >= 5) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado!");
        }

        scan.close();
        
    }
}
