import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da compra R$: ");
        double valor = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");
        System.out.println("------------------------------");

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("------------------------------");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Débito selecionado");
                System.out.println("Valor final da compra:" + (valor + (valor / 100 * 5)));
                break;
            case 2:
                System.out.println("Pix selecionado");
                System.out.println("Valor final da compra:" + (valor + (valor / 100 * 10)));
                break;
            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas: ");
                int parcelas = scanner.nextInt();
                if(parcelas <= 4){
                    System.out.println("Valor final da compra:" + (valor + (valor / 100 * 2)));
                } else if (parcelas > 4) {
                    System.out.println("Valor final da compra:" + (valor + (valor / 100 * 5)));
                }
                break;
        }

    }
}