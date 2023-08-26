package phase1.matrix;

import static phase1.matrix.TransposeMatrixKt.transpose;

public class RotateMatrixAntiClockWIse {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int [][] matrix) {
        transpose(matrix);
        for (int i = 0; i <= matrix.length/2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = temp;
            }
        }
    }
}

