import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em milímetro: ");
        double mm = scanner.nextDouble();

        double polegadas = mm / 25.4;

        System.out.println("A medida em polegadas é: " + polegadas);


    }
}