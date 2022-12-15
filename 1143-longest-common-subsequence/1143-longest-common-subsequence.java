class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] arr=new int[text1.length()+1][text2.length()+1];
        
        for(int i=0;i<text2.length()+1;i++)
        {
            arr[0][i]=0;
        }
        for(int i=0;i<text1.length()+1;i++)
        {
            arr[i][0]=0;
        }
        
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else
                {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        
        
        return arr[text1.length()][text2.length()];
        
    }
}