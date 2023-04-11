class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int y=matrix[0].length-1;
        int x=0;
        
        while(x<matrix.length && y>=0 )
        {
            if(matrix[x][y]==target)
            {
                return true;
            }
            else if(matrix[x][y]>target)
            {
                y--;
            }
            else
            {
                x++;
            }
           
        }
        return false;
        
    }
}