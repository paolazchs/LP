import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double km = milhas * 1.609;

        System.out.println("A distância em quilômetros é: " + km);

    }
}