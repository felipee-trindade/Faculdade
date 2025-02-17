import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        /*
         * Crie um código em JAVA para realizar a conversão de temperatura em graus
         * Celsius para Kelvin. Exibir na tela as duas temperaturas.
         * 
         */

        Scanner teclado = new Scanner(System.in);

        float celsius;
        double kelvin;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = teclado.nextFloat();

        kelvin = celsius + 273.15;

        System.out.printf("%.1f°C equivalem a %.1fK %n", celsius, kelvin);
    }
}
