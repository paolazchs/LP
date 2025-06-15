import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {3, 8, 12, 5, 7, 9, 10, 2, 15, 6};

        System.out.print("Me diga um número para eu procurar no vetor: ");
        int numeroDigitado = scanner.nextInt();

        int posicaoEncontrada = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroDigitado) {
                posicaoEncontrada = i;
                break;
            }
        }

        if (posicaoEncontrada != 0) {
            System.out.println("Achei! O número está na posição: " + posicaoEncontrada);
        } else {
            System.out.println("Poxa, não encontrei esse número no vetor.");
        }
    }
}