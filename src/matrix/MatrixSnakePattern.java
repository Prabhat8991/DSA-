package matrix;

import java.util.ArrayList;

public class MatrixSnakePattern {
    public static void main(String[] args) {
       int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
       SnakePattern(matrix);
    }

    private static void SnakePattern(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            if (i%2 == 0) {
               for (int j = 0; j < matrix[i].length; j++) {
                   arrayList.add(matrix[i][j]);
               }
            } else {
                for (int j = matrix[i].length-1; j >= 0; j--) {
                    arrayList.add(matrix[i][j]);
                }
            }
        }
    }
}
