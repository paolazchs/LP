import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        System. out. println("Informe o raio do cilindro: ");
        double raio = scanner . nextDouble () ;
        System. out.println("Informe a altura do cilindro:");
        double altura = scanner. nextDouble () ;

        double volume = 3.14 * (raio*2) * altura;

        System. out. println("0 volume do cilindro: " + volume) ;

    }
}