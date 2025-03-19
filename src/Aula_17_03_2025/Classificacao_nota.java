package Aula_17_03_2025;

import java.util.Scanner;

public class Classificacao_nota {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nomeAluno, mensagem;
        double nota1, nota2, nota3, nota4, media;


        System.out.print("Digite o nome do Aluno: ");
        nomeAluno = scan.next();
        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextInt();
        System.out.print("Digite a quarta nota: ");
        nota4 = scan.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media > 80) {
            mensagem = "Ótimo!";
        }
        else if (media > 60) {
            mensagem = "Bom";
        }
        else if (media > 40) {
            mensagem = "Regular";
        }
        else if (media > 20) {
            mensagem = "Ruim";
        }
        else {
            mensagem = "Péssimo";
        }

        System.out.printf("%nNome do Aluno: %S%nNota 1: %.2f%nNota 2: %.2f%nNota 3: %.2f%nNota 4: %.2f%nMédia: %.2f%nClassificação: %s%n%n", nomeAluno, nota1, nota2, nota3, nota4, media, mensagem);

        scan.close();
    }
}
