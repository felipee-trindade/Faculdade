import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saque;
        int qtdCem, cem, qtdCinquenta, cinquenta, qtdVinte, vinte, qtdDez, dez, qtdCinco, cinco;

        System.out.print("Digite o valor a ser sacado: ");
        saque = teclado.nextDouble();

        cem = (int) saque % 100;
        qtdCem = (int) saque / 100;

        cinquenta = cem % 50;
        qtdCinquenta = cem / 50;

        vinte = cinquenta % 20;
        qtdVinte = cinquenta / 20;

        dez = vinte % 10;
        qtdDez = vinte / 10;

        cinco = dez % 5;
        qtdCinco = dez / 5;

        System.out.printf("%nSaque: R$ %.2f%nQuantidade de nota de R$ 100,00: %3d %nQuantidade de nota de R$  50,00: %3d %nQuantidade de nota de R$  20,00: %3d %nQuantidade de nota de R$  10,00: %3d %nQuantidade de nota de R$   5,00: %3d %n%n", saque, qtdCem, qtdCinquenta, qtdVinte, qtdDez, qtdCinco); 
    }
}
