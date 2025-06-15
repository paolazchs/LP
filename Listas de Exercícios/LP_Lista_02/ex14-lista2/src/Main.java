import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        System. out. println("Informe a base: ");
        double base = scanner. nextDouble();
        System.out. println("Informe a altura: ");
        double altura = scanner . nextDouble () ;

        double area = base * altura/2;

        System.out.println("A área do triangulo é: " + area);
    }
}