package phase1.matrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
       int [] [] input = {{1,2,3}, {4,5,6}, {7,8,9}};
       transpose(input, 3);
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
             System.out.print(input[i][j]);
           }
           System.out.println();
       }
    }

    public static void transpose(int matrix[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                swap(matrix, i, j);
            }
        }
    }

    static void swap(int matrix[][], int i, int j) {
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
