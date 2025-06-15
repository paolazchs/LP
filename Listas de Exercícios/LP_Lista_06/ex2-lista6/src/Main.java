import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O numero precisa ser maior que zero!");
        } else {
            int resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
    }

    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
