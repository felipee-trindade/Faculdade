package Aula_24_02_2025;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        /*
        * Crie um código em JAVA para calcular a média de um determinado aluno,
        * através de 4 notas informadas via teclado, juntamente com o nome do aluno.
        * Exibir a média e o nome do aluno na tela.
        */

        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;
        String nomeAluno;

        System.out.print("Digite o nome do Aluno: ");
        nomeAluno = teclado.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = teclado.nextFloat();
        System.out.print("Digite a quarta nota: ");
        nota4 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Nome: %s | Nota 1: %.2f | Nota 2: %.2f | Nota 3: %.2f | Nota 4: %.2f | Média: %.2f%n%n", nomeAluno, nota1, nota2, nota3, nota4, media);

        teclado.close();
    }
}
