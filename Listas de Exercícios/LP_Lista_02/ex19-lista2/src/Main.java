import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os coeficientes a, b e c: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        double delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Sem raizes reais. ");
        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);
            System.out.printf(delta == 0 ? "Raiz única: x = %.2f\n" : "Raízes: x1 = %.2f, x2 = %.2f\n", x1, x2);

        }
    }
}