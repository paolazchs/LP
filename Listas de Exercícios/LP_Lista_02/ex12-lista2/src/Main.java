import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;
        double media;

        System.out.println("Informe a primeira nota: ");
        double N1 = scanner . nextDouble () ;
        System. out. println("Informe a segunda nota: ");
        double N2 = scanner . nextDouble() ;

        media = (N1 * 1 + N2 * 2) / 3;

        if (media >= 0 && media <= 10) {
            System.out.print("A média é " + media) ;
        } else {
            System. out. print("A média está fora do valor");
        }

    }
}