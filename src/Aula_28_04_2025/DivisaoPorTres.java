package Aula_28_04_2025;

public class DivisaoPorTres {
    public static void main(String[] args) {
        divisor();
    }

    public static void divisor() {
        for(int i = 50; i <= 9500; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
