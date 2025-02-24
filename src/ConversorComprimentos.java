import java.util.Scanner;

public class ConversorComprimentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peParaPolegada, pe, peParaJarda, peParaMilha;

        System.out.print("Digite a medida em pés: ");
        pe = teclado.nextDouble();

        peParaPolegada = pe * 12;
        peParaJarda = pe / 3;
        peParaMilha = pe / 5280;

        System.out.printf("%nPés: %5.1f -> | Polegada(s): %5.1f | Jarda(s): %5.1f | Milha(s): %5.1f%n%n", pe, peParaPolegada, peParaJarda, peParaMilha);
    }
}
