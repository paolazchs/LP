import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double valor = scanner.nextDouble();

        System.out.println("O valor informado foi: " + valor);
        if (valor < 5 && valor > 9){
            System.out.println("Valor inválido!");
        } else {
            System.out.println("O valor está dentro do padrão!");
        }
    }
}