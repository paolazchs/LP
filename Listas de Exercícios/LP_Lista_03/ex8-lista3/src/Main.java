import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double valor = scanner.nextDouble();

        if (valor % 2 == 0){
            System.out.println("O número informado é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}