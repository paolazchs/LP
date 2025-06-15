import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em km: ");
        double km = scanner.nextDouble();

        double conversao = km * 1000;

        System.out.println("A velocidade em metros é: " + conversao);
    }
}