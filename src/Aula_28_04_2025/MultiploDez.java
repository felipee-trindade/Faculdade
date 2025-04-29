package Aula_28_04_2025;

public class MultiploDez {
    public static void main(String[] args) {
        for (int i = 1; i <= 250; i++) {
            if (i % 10 == 0) {
                System.out.printf("%d - Múltiplo de 10%n", i);
            }
            else {
                System.out.println(i);
            }
        }
    }
}