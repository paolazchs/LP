import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.println("------------------------------");

        System.out.println("Escolha uma opção: ");
        System.out.println("------------------------------");
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Informe o valor do raio: ");
                double raio = scanner.nextDouble();
                System.out.println("Área:" + (3.14 * (raio * raio)));
                System.out.println("Perímetro:" + (2 * 3.14 * raio));
                break;
            case 2:
                System.out.println("Informe a base: ");
                double base = scanner.nextDouble();
                System.out.println("Informe  a altura  ");
                double altura = scanner.nextDouble();
                System.out.println("Área:" + (base * altura)/2 );
                break;
            case 3:
                System.out.println("Informe a base: ");
                double b = scanner.nextDouble();
                System.out.println("Informe  a altura  ");
                double a = scanner.nextDouble();
                System.out.println("Área:" + (b * a));
                System.out.println("Perímetro:" + 2 * (b+a));
                break;
        }
    }
}