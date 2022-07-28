package matrix;

public class SearchInRowAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
      int [][] input = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
      System.out.print(searchMatrix(input, 11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int resultRow = -1;
       for (int i = 0; i < matrix.length; i++) {
           if (target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]) {
               return false;
           }
           if (target == matrix[i][0]) {
               return true;
           } else if (target < matrix[i][0]) {
               resultRow = i;
               break;
           }
       }

        if(resultRow == -1) {
            for (int i = 0; i < matrix[matrix.length-1].length;i++) {
                if(target == matrix[matrix.length-1][i]) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < matrix[resultRow - 1].length; i++) {
                if (target == matrix[resultRow - 1][i]) {
                    return true;
                }
            }
        }

       return false;
    }
}

