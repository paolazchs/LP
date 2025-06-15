public class Main {
    public static void main(String[] args) {

        int[][] detMatriz = {
                {1 , 2 ,3},
                {0, 1, 4 },
                {5, 6, 0 }
        };

        int det =
                detMatriz[0][0] * detMatriz[1][1] * detMatriz[2][2] +
                        detMatriz[0][1] * detMatriz[1][2] * detMatriz[2][0] +
                        detMatriz[0][2] * detMatriz[1][0] * detMatriz[2][1] -
                        detMatriz[0][2] * detMatriz[1][1] * detMatriz[2][0] -
                        detMatriz[0][0] * detMatriz[1][2] * detMatriz[2][1] -
                        detMatriz[0][1] * detMatriz[1][0] * detMatriz[2][2];

        System.out.println("Determinante da matriz: " + det);
    }
}