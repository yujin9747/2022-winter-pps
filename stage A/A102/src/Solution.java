public class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int m=0; m < matrix.length; m++){
            for(int n=0; n <  matrix[m].length; n++){
                result[n][m] = matrix[m][n];
            }
        }
        return result;
    }
}
