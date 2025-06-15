import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em metros: ");
        double metros = scanner.nextDouble();

        double conversao = metros / 1000;

        System.out.println("A velocidade em km é: " + conversao);
    }
}