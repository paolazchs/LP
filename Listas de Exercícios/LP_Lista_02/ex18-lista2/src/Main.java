import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System. out.print("Digite o valor de a: ");
        double a = scanner. nextDouble () ;
        System. out.print("Digite o valor de b: ");
        double b = scanner . nextDouble () ;

        double x = - b / a;
        System.out.println("A solução dessa equação de primeiro grau é: " + x);
    }
}