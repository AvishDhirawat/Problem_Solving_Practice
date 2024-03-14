import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

    // LeetCode
    // Better Approach
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[m - 1].length;

        int[] row = new int[m];
        int[] col = new int[n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
//                    makeZero(matrix, i, j);
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }

        }
    }

//    public void makeZero(int[][] matrix, int a, int b) {
//        int m = matrix.length;
//        int n = matrix[m - 1].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == a || j == b) {
//                    matrix[i][j] = -1;
//                }
//            }
//        }
//    }

    // Coding Ninja - Optimal Solution
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        SetMatrixZero setMatrixZero = new SetMatrixZero();
        setMatrixZero.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix1.size();
        int m = matrix1.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix1, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
