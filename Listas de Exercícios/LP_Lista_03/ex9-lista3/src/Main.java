import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro lado: ");
        double l1 = scanner.nextDouble();
        System.out.println("Informe o segundo lado: ");
        double l2 = scanner.nextDouble();
        System.out.println("Informe o terceiro lado: ");
        double l3 = scanner.nextDouble();

        if ( l1 == l2 && l2 == l3){
            System.out.println("É um triangulo equilátero");
        } else if ( l1 == l2 || l1 == l3 || l2 == l3 ){
            System.out.println("É um triangulo isósceles");
        } else {
            System.out.println("É um triangulo escaleno");
        }
    }
}