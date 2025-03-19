package Aula_17_03_2025;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String sexo;
        double altura, pesoIdeal = 0;

        System.out.print("Digite seu sexo [M/F]: ");
        sexo = scan.next().toUpperCase();
        System.out.print("Digite sua altura (cm): ");
        altura =  scan.nextDouble();
        

        if (sexo.equals("M")) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        }
        else if (sexo.equals("F")) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4));
        }
        else { 
            System.out.printf("Sexo inválido...\n\n");
        }

        System.out.printf("%nSexo: %s%nAltura: %d%nPeso ideal: %.3f%n%n", sexo, (int) altura, pesoIdeal);
    
        scan.close();
    }
}
