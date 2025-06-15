import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;
        System.out.println("A média é: " + media);
        if (media < 50){
            System.out.println("O aluno foi reprovado!");
        } else {
            System.out.println("O aluno foi aprovado!");
        }
    }
}