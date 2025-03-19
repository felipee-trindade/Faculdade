package Aula_17_03_2025;

import java.util.Scanner;

public class Premiacao_desempenho {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media, porcentagemPresenca, qtdAulas_double, qtdPresenca_double;
        int qtdAulas_int, qtdPresenca_int;
        String mensagem;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scan.nextDouble();
        System.out.print("Digite a quantidade de aulas dadas: ");
        qtdAulas_int = scan.nextInt();
        System.out.print("Digite a quantidade de presenças: ");
        qtdPresenca_int = scan.nextInt();

        qtdAulas_double = qtdAulas_int;
        qtdPresenca_double = qtdPresenca_int;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        porcentagemPresenca = 100 * qtdPresenca_double / qtdAulas_double;

        if (media > 80 && porcentagemPresenca == 100) {
            mensagem = "Excursão";
        }
        else if (media > 80 || porcentagemPresenca == 100) {
            mensagem = "Camisa";
        }
        else if (media >= 70 && media <= 80 && porcentagemPresenca >= 90) {
            mensagem = "Squeeze";
        }
        else if (media >= 70 && media <= 80 || porcentagemPresenca >= 90) {
            mensagem = "Caneta personalizadas";
        }
        else {
            mensagem = "Não há prêmios";
        }

        System.out.println("\n" + mensagem + "\n");

        scan.close();
    }
}
