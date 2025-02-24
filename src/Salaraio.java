import java.util.Scanner;

public class Salaraio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        double salario, novoSalario, aumento;

        System.out.print("Digite o nome do Funcionário: ");
        nome = teclado.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        salario = teclado.nextDouble();

        aumento = salario * 0.25;
        novoSalario = salario + aumento;

        System.out.printf("%nO funcionário %s teve um aumento de R$ %7.2f. Sendo seu novo salário de R$ %7.2f%n%n", nome, aumento, novoSalario);


    }
}
