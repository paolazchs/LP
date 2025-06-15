import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System. out. println("Informe o raio do circulo: ");
        double raio = scanner . nextDouble ();

        double area = 3.14 * (raio*raio);

        System.out. println("A área do circulo é: "+ area);

    }
}