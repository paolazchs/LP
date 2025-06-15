import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um número real: ");
        double num = scanner.nextDouble();

        if (num > 0){
            double raiz = Math.sqrt(num);
            System.out.println("A raiz do número é: " + raiz);
        } else {
            System.out.println("Valor inválido!");
        }
    }
}