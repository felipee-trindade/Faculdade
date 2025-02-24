public class EquacaoSegundoGrau1 {
    public static void main(String[] args) {
        
        double a = 1, b = -5, c =6, delta;
        double raiz1, raiz2;

        delta = Math.pow(b, 2) - 4 * a * c;

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);

        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("%nOs valores das raízes são: Raiz 1: %.2f | Raíz 2: %.2f%n%n", raiz1, raiz2);

    }
}
