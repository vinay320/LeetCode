class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       HashSet vis = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; j++) {
            //current number
            char number = board[i][j];
            if (number != '.')

                if (!vis.add(number + " in row " + i) ||
                    !vis.add(number + " in column " + j) ||
                    !vis.add(number + " in block " + i/3 + "X" + j/3))
                    return false;
        }
    }
    return true;
        
    }
}
    