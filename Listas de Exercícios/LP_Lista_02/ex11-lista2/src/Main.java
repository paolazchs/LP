import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        System. out. println("Temperatura em graus Celsius: ");
        double C = scanner . nextDouble() ;

        double conversao = (C * 9/5) + 32;

        System.out.println("A conversão dessa temperatura para Fahrenheit é igual: " + conversao);
    }
}