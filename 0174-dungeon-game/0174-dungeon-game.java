class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
     int[][] arr=new int[dungeon.length][dungeon[0].length];
    for(int[] i:arr)
    {
        Arrays.fill(i,-1);
    }
        
     int c=bnm(dungeon,0,0,arr);
        return c;
    }
    
    static int bnm(int[][] dungeon,int i,int j,int[][] arr)
    {
        if(i==dungeon.length || j==dungeon[0].length)
        {
            return Integer.MAX_VALUE;
        }
        
        if(i==dungeon.length-1 && j==dungeon[0].length-1)
        {
            return dungeon[i][j]>0?1:1-dungeon[i][j];
        }
        
        if(arr[i][j]!=-1)
        {
         return    arr[i][j];
        }
        int r=bnm(dungeon,i,j+1,arr);
        int d=bnm(dungeon,i+1,j,arr);
        int hp=Math.min(r,d)-dungeon[i][j];
        return arr[i][j]=hp>0?hp:1;
    }
}