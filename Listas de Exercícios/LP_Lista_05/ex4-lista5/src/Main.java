import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numbers = new int[10];
        int maior, menor;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        System.out.println("Informe 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numbers[i] = entrada.nextInt();
        }

        maior = menor = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
                posicaoMaior = i;
            }
            if (numbers[i] < menor) {
                menor = numbers[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O maior número que você digitou foi " + maior + ", que está na posição " + posicaoMaior + ".");
        System.out.println("O menor número digitado foi " + menor + ", na posição " + posicaoMenor + ".");

    }
}