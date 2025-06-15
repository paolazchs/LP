import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7: ");
        int num = scanner.nextInt();

        if (num == 1){
            System.out.println("Domingo");
        } else if (num == 2) {
            System.out.println("Segunda-feira");
        } else if (num == 3) {
            System.out.println("Terça-feira");
        } else if (num == 4) {
            System.out.println("Quarta-feira");
        } else if (num == 5) {
            System.out.println("Quinta-feira");
        } else if (num == 6) {
            System.out.println("Sexta-feira");
        } else if (num == 7) {
            System.out.println("Sábado");
        }
    }
}