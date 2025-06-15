public class Main {
    public static void main(String[] args) {
        int[] numeros = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valorBuscado = 42;

        int posicao = buscaRecursiva(numeros, valorBuscado, 0, numeros.length - 1);

        if (posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int buscaRecursiva(int[] array, int valorBuscado, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == valorBuscado) {
            return meio;
        }
        else if (array[meio] < valorBuscado) {
            return buscaRecursiva(array, valorBuscado, meio + 1, fim);
        }
        else {
            return buscaRecursiva(array, valorBuscado, inicio, meio - 1);
        }
    }
}
