import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("------------------------------");

        System.out.println("Escolha uma opção: ");
        System.out.println("------------------------------");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Soma:" + (n1+n2));
                break;
            case 2:
                System.out.println("Subtração:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplicação:" + (n1 * n2));
                break;
            case 4:
                System.out.println("Divisão:" + (n1/n2));
                break;
        }
    }
}