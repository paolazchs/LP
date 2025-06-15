public class Main {
    public static void main(String[] args) {
        int[] numeros = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valorBuscado = 42;

        int posicao = busca(numeros, valorBuscado);

        if (posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int busca(int[] array, int valorBuscado) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valorBuscado) {
                return meio;
            } else if (array[meio] < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}