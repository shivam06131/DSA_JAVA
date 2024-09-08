package ArrayHard;

public class Rotate2DArray {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] val = rotate(matrix);
    }

    static int[][] rotate(int[][] matrix){
        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i<matrix.length; i++){
            for(int j =i; j<matrix[0].length; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        System.out.println("Transposed ---");
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

        // Step 2: Reverse each row
        for(int i = 0; i<matrix.length; i++){
            for(int j =0 ; j<n/2; j++){

                int temp = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = matrix[i][j];
                matrix[i][j] = temp;

            }
        }

        System.out.println("Reversed ---");
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

            return matrix;
    }
}
