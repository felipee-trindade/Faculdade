import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    
        double base = 0, altura = 0, area;

        System.out.print("Digite a base do triângulo: ");
        base = teclado.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = teclado.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("%nBase: %.1f | Altura: %.1f | Área: %.1f%n%n", base, altura, area);


    }
}
