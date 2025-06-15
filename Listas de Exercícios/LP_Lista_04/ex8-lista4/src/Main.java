import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Número inválido para verificação de primo.");
        } else {
            int divisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println("O número " + numero + " é primo!");
            } else {
                System.out.println("O número " + numero + " não é primo.");}

        }
    }
}