package ArrayHard;

public class Search2DMatrix {
    public static void main(String[] args) {


        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 3;
        System.out.println(searchMatrix(matrix1, target1)); // Output: true

//        int[][] matrix2 = {
//                {1, 3, 5, 7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 60}
//        };
//        int target2 = 13;
//        System.out.println(searchMatrix(matrix2, target2)); // Output: false
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("rows " + rows);
        System.out.println("cols " + cols);

        // Apply binary search as if it's a 1D array
        int left = 0;
        int right = rows * cols - 1;
        System.out.println("-------------------");

        while (left <= right) {
            System.out.println("left " + left);
            System.out.println("right " + right);

            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D

            System.out.println("col1 => " + (mid / cols));
            System.out.println("col2 => " + (mid % cols));

            System.out.println("mid " + mid);
            System.out.println("midElement " + midElement);
            System.out.println("-------------------");

            if (midElement == target) {
                return true; // Target found
            } else if (midElement < target) {
                left = mid + 1; // Ignore the left half
            } else {
                right = mid - 1; // Ignore the right half
            }
        }

        return false; // Target not found
    }
}
