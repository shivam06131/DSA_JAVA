package ArrayHard;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] matrix2 = {{1, 2, 3}};
        int[][] matrix3 = {{7}, {9}, {6}};

        doSpiralMatrix(matrix2);
    }

    static void doSpiralMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        int top = 0;
        int left = 0;
        int right = col;
        int bottom = row;

        ArrayList<Integer> result = new ArrayList<>();

        // Use `&&` in the while condition, so both rows and columns are within bounds
        while (top <= bottom && left <= right) {
            // top -> right (move across the top row)
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Move the top boundary down
            System.out.println("left -> right " + result);

            // right -> bottom (move down the right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            System.out.println("right -> bottom " + result);
            // bottom -> left (move across the bottom row)
            if (top <= bottom) { // Check if there's a valid bottom row to traverse
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }
            System.out.println("bottom -> left " + result);

            // left -> top (move up the left column)
            if (left <= right) { // Check if there's a valid left column to traverse
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
            System.out.println("left -> top " + result);
        }

        System.out.println("Spiral order: " + result);
    }
}