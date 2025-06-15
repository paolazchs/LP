import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dinheiro: ");
        double d = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");
        System.out.println("------------------------------");

        System.out.println("Escolha uma opção: ");
        System.out.println("------------------------------");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bebida selecionada: Café Expresso");
                System.out.println("Seu troco: R$ "+    (d - 0.50));
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                System.out.println("Seu troco: R$ "+(d - 1.0));
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                System.out.println("Seu troco: R$ "+(d - 2.50));
                break;
            case 4:
                System.out.println("Bebida selecionada: Chocolate");
                System.out.println("Seu troco: R$ "+(d - 2.0));
                break;
        }
    }
}
