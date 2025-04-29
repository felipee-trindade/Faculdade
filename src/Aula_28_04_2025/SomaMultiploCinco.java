package Aula_28_04_2025;

public class SomaMultiploCinco {
    public static void main(String[] args) {
        SomarTermos();
    }

    public static void SomarTermos() {
        int total = 0;
        int contador = 1;

        for (int i = 5; i <= 5 * 15; i += 5) {
            total += i;
            System.out.println(contador);
        }

        System.out.println("A soma dos dos termos é: " + total);
    }
}
