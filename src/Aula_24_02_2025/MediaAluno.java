package Aula_24_02_2025;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3, nota4;
        float media;

        Scanner tc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = tc.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = tc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = tc.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = tc.nextFloat();
        System.out.print("Digite a quarta nota: ");
        nota4 = tc.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Nome: %s | Nota 1 - %5.2f | Nota 2 - %5.2f | Nota 3 - %5.2f | Nota 4 - %5.2f | Média: %5.2f%n", nome, nota1, nota2, nota3, nota4, media);

        tc.close();

    }
}
