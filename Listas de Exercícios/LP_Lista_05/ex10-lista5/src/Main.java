public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {2, 4},
                {2, 4},
                {2, 4}
        };

        int[][] B = {
                {2, 4},
                {2, 4}
        };

        int[][] C = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }

        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
        }
    }
}