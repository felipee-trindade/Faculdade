package Aula_17_03_2025;

import java.util.Scanner;

public class Tempo_jogo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int horaInicio, minInicio, horaFim, minFim, tempoInicioEmMinutos, tempoFimEmMinutos, tempoTotal;

        System.out.println("Horário de início");
        System.out.print("Hora: ");
        horaInicio = scan.nextInt();
        System.out.print("Min: ");
        minInicio = scan.nextInt();
        System.out.println("Horário do término");
        System.out.print("Hora: ");
        horaFim = scan.nextInt();
        System.out.print("Min: ");
        minFim = scan.nextInt();

        tempoInicioEmMinutos = (horaInicio * 60) + minInicio;
        tempoFimEmMinutos = (horaFim * 60) + minFim;

        if (tempoInicioEmMinutos >= tempoFimEmMinutos ) {
            tempoTotal = 1440 - (tempoInicioEmMinutos - tempoFimEmMinutos);
            System.out.printf("%nHora: %02d%nMin: %02d%n%n", tempoTotal / 60, tempoTotal % 60);
        }
        else {
            tempoTotal = tempoFimEmMinutos - tempoInicioEmMinutos;
            System.out.printf("%nDuração%nHora: %02d%nMin: %02d%n%n", tempoTotal / 60, tempoTotal % 60);
        }

        scan.close();
    }
}
