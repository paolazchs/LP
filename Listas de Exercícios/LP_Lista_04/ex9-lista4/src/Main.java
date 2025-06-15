import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            System.out.println("Vamos começar o jogo da tabuada!");
            boolean erro = false;

            outer:
            for (int num = 1; num <= 10; num++) {
                for (int mult = 0; mult <= 10; mult++) {
                    System.out.print("Quanto é " + num + " x " + mult + "? ");
                    int resposta = scanner.nextInt();

                    int resultado = num * mult;

                    if (resposta != resultado) {
                        System.out.println("Ops! Você errou. O resultado correto é " + resultado + ".");
                        erro = true;
                        break outer;
                    }
                }
            }

            if (!erro) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros!");
            } else {
                System.out.println("Fim de jogo! Melhor sorte da próxima vez.");
            }

            System.out.print("Quer jogar novamente? (s/n): ");
            String respostaFinal = scanner.next();
            jogarNovamente = respostaFinal.equalsIgnoreCase("s");

        } while (jogarNovamente);

    }
}