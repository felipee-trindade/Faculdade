package Aula_17_03_2025;

import java.util.Scanner;

public class Tipo_triangulo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int lado1, lado2, lado3, soma1, soma2, soma3;
        String tipoTriangulo;

        System.out.print("Digite o primeiro lado: ");
        lado1 = scan.nextInt();
        System.out.print("Digite o segundo lado: ");
        lado2 = scan.nextInt();
        System.out.print("Digite o terceiro lado: ");
        lado3 = scan.nextInt();

        soma1 = lado1 + lado2;
        soma2 = lado1 + lado3;
        soma3 = lado2 + lado3;

        if (!(lado1 < soma3 && lado2 < soma2 && lado3 < soma1)) {
            System.out.println("Triângulo inválido!");
            System.exit(0);;
        }

        if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "Equilátero";
        }
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            tipoTriangulo = "Escaleno";
        }
        else {
            tipoTriangulo = "Isósceles";
        }

        System.out.printf("%nTriângulo %s%nMedida 1: %d%nMedida 2: %d%nMedida 3: %d%n%n", tipoTriangulo, lado1, lado2, lado3);

        scan.close();
    }
}
