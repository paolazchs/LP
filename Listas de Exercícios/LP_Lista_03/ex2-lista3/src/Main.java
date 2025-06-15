import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro número é maior!");
        } else {
            System.out.println("O segundo número é maior!");
        }
    }
}