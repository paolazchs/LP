public class Main {
    public static void main(String[] args) {
                int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                int aux;

                for (int i = 0; i < v.length / 2; i++) {
                    aux = v[i];
                    v[i] = v[v.length - 1 - i];
                    v[v.length - 1 - i] = aux;
                }

                for (int num : v) {
                    System.out.print(num + " ");
                }
            }
        }

