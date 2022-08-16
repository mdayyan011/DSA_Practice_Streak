class Solution {
    public void setZeroes(int[][] matrix) {
          int m = matrix.length;
        int n = matrix[0].length;

        boolean isZero = false;
         

        // to generate 1day array
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0)
                isZero = true;
            for (int j = 1; j < n; j++) {
               if(matrix[i][j]==0)
               {
                   matrix[i][0] = matrix[0][j] = 0;
               }
            }
        }
        //checking and manipulating 2d
        for (int i = m - 1; i >= 0; i--)
        {
            for(int j=1;j<n;j++)
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (isZero)
                matrix[i][0] = 0;
        }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    
    }
}