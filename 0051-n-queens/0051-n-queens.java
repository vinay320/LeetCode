class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = '.';
        List<List<String>> res=new ArrayList<>();
        Sol(arr,res,0);
        return res;
    }
    static List < String > create(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    
    static void Sol(char[][] arr,List<List<String>> res,int col)
    {
        if(col==arr.length)
        {
            res.add(create(arr));
            return;
        }
        
        for(int row=0;row<arr.length;row++)
        {
            if(Correct(arr,row,col))
            {
                arr[row][col]='Q';
                Sol(arr,res,col+1);
                arr[row][col]='.';
            }
        }
    }
    
    static boolean Correct(char[][] arr,int row ,int col)
    {
        int x=row;
        int y=col;
        
        while(x>=0 && y>=0)
        {
            if(arr[x][y]=='Q')
            {
                return false;
            }
            x--;
            y--;
        }
        
        x=row;
        y=col;
        while(y>=0)
        {
            if(arr[x][y]=='Q')
            {
                return false;
            }
            y--;
        }
        
        x=row;
        y=col;
        while(y>=0 && x<arr.length)
        {
            if(arr[x][y]=='Q')
            {
                return false;
            }
            y--;
            x++;
        }
        return true;
    }
}