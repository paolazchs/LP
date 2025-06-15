import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media > 8.5){
            System.out.println("Excelente!");
        } else if (media >= 7 ){
            System.out.println("Bom!");
        } else if (media >= 5 ) {
            System.out.println("Ruim!");
        } else if (media < 5) {
            System.out.println("Muito ruim!");
        }
    }
}