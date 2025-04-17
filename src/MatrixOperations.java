import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        // Addition
        System.out.println("Addition:");
        printMatrix(add(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction:");
        printMatrix(subtract(matrix1, matrix2));

        // Multiplication
        System.out.println("Multiplication:");
        printMatrix(multiply(matrix1, matrix2));

        sc.close();
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
