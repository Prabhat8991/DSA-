package phase1.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
      int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
      for (int i : spiralOrder(matrix))  {
          System.out.print(i + " ");
      }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;
        List<Integer> result = new ArrayList<Integer>();

        while(top <= bottom && left <= right) {
            //print top row : left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            //print right column: top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //print bottom row: right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                //print left column: bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;

    }
}
