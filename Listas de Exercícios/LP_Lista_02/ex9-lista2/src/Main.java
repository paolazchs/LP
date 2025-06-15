import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double km = scanner.nextDouble();

        double milhas = km/1.609;

        System.out.println("A distância em milhas é: " + milhas);
    }
}