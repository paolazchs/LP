import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                if (i >= 0) {
                    System.out.println(i);
                }
            }
        }
    }
}