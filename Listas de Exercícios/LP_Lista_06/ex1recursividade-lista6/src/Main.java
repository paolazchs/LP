import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int num = scanner.nextInt();

        int resultado = somaAteN(num);
        System.out.println("A soma de 1 até " + num + " é: " + resultado);
    }

    public static int somaAteN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + somaAteN(n - 1);
    }
}