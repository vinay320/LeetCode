class Solution {
    public void solveSudoku(char[][] board) {
       backtracing(board, 0, 0);
    }

    public boolean backtracing (char[][] board, int i, int j) {
        if(i > 8)
            return true;
        if(i == 8 && j == 8 && board[i][j] != '.')
            return true;

        if(board[i][j] == '.'){
            for(char ch='1'; ch<='9';ch++){
                if(!isValid(board, i,j, ch))
                    continue;
                board[i][j] = ch;
                if(backtracing(board, j == 8 ? i+1 : i, j==8 ? 0 : j+1))
                    return true;             
                else
                     board[i][j] = '.';
            }

            return false;
        }

        return backtracing(board, j == 8 ? i+1 : i, j==8 ? 0 : j+1);
    }

    public boolean isValid(char[][] board, int i,int j, char ch){
        for(int k =0; k<9;k++){
            if(board[i][k] == ch)
                return false;
            if(board[k][j] == ch)
                return false;
            if(board[(i/3)*3 + k/3][(j/3)*3 + k%3] == ch)
                return false;
        }
        return true;
    }
}