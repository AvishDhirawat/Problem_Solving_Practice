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

    public static void main(String[] args) {
//        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        SetMatrixZero setMatrixZero = new SetMatrixZero();
        setMatrixZero.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
