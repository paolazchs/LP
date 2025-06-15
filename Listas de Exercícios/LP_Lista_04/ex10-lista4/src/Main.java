import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci você quer ver: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Digite um número maior que zero.");
        } else {
            int termo1 = 0;
            int termo2 = 1;

            System.out.println("Sequência de Fibonacci:");

            for (int i = 1; i <= n; i++) {
                System.out.print(termo1 + " ");

                int proximoTermo = termo1 + termo2;
                termo1 = termo2;
                termo2 = proximoTermo;
            }

        }
    }
}
