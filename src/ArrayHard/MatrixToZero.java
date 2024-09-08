package ArrayHard;

public class MatrixToZero {
    public static void main(String[] args) {

        int[][] matrix = {{1,3,0,1},{2,0,2,4},{3,6,8,3}};
        int[][] matrix2 = {{1,1,1},{1,0,1},{1,1,1}};
        setMatrixToZero(matrix2);
    }

    //----STEPS----
    //find if 1st row contains 0
    //find if 1st col contains 0
    //mark all other rows/cols first element to 0
    //update all row/col to zero using the mark
    //update first row to zero if it was in first check
    //update first col to zero if it was in second check


    static void setMatrixToZero(int[][] matrix) {
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        // Check if the first row contains zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        // Check if the first column contains zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        // Use first row and first column to mark zeroes for other rows and columns
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set corresponding rows and columns to zero
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Finally, update the first row and first column if needed
        if (isFirstRowZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isFirstColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
