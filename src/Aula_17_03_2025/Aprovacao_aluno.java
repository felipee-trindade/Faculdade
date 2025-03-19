package Aula_17_03_2025;

import java.util.Scanner;

public class Aprovacao_aluno {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, media, notaRecuperacao;
        String mensagem;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            mensagem = "Aluno Aprovado!";
        }
        else if (media < 5) {
            mensagem = "Aluno Reprovado!";
        }
        else {
            System.out.println("\n\nAluno está de recuperação!\n");
            System.out.print("Digite a nota da atividade de Recuperação: ");
            notaRecuperacao = scan.nextDouble();
            media = (media + notaRecuperacao) / 2;
            if (media < 6) {
                mensagem = "Aluno Reprovado!";
            }
            else {
                mensagem = "Aluno Aprovado por recuperação!";
            }
        }

        System.out.printf("%nSituação: %S%n%n", mensagem);


        scan.close();
    }
}
