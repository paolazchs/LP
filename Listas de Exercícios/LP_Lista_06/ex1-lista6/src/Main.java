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
        if (n <= 0) {
            System.out.println("O valor precisa ser maio que zero!");
        }
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

}