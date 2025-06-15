import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser maior que zero!");
        } else {
            int resultado = potencia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        }
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
}