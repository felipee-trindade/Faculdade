package Aula_17_03_2025;

import java.util.Scanner;

public class Plano_saude {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String planoSaude, mensagem;

        System.out.print("Digite seu plano de Saúde: ");
        planoSaude = scan.nextLine().toUpperCase();

        switch (planoSaude) {
            case "BÁSICO": // Agora o acento está correto
                mensagem = "Mensalidade R$ 150,00";
                break;
            case "BRONZE":
                mensagem = "Mensalidade R$ 220,00";
                break;
            case "PRATA":
                mensagem = "Mensalidade R$ 310,00";
                break;
            case "OURO":
                mensagem = "Mensalidade R$ 450,00";
                break;
            default:
                mensagem = "Plano inválido";
                break;
        }

        System.out.println("\n" + mensagem + "\n");

        scan.close();
    }
}
