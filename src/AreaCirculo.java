import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int raio;
        double circunferenia, area;

        System.out.print("Digite o valor do raio: ");
        raio = teclado.nextInt();

        circunferenia = Math.PI * raio * 2;
        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("%nCircunferência: %.1f |Área: %.1f%n%n", circunferenia, area);

    }
}
