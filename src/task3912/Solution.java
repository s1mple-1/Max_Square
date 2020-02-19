package task3912;

/* 
Максимальная площадь
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0},
        };
        System.out.println(maxSquare(mat));
    }

    public static int maxSquare(int[][] matrix) {
        int count = 0;
        int[][] resMat = Arrays.copyOf(matrix, matrix.length);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    resMat[i][j] = Integer.min(matrix[i][j - 1], Integer.min(matrix[i - 1][j - 1], matrix[i - 1][j])) + 1;
                }
                if (resMat[i][j] > count) {
                    count = resMat[i][j];
                }
            }
        }
        return count*count;
    }
}
