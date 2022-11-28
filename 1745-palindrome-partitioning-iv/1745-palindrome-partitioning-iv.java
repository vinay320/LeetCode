class Solution {
    public boolean checkPartitioning(String s) {
        boolean[][] isP = precomputeSubarrayPaildrome(s);
        int requiredCuts = 3 ;
        return check(s,0,requiredCuts,isP);
        
    }
    
    static boolean check(String s, int i, int rem, boolean[][] isP){
        if(i==s.length())
            return false;
        if(rem==1)
            return isP[i][s.length()-1];
        
        for(int j=i;j<s.length();j++)
            if(isP[i][j] && check(s,j+1,rem-1,isP))
                return true;
        
        return false;
    }
    
    public static boolean[][] precomputeSubarrayPaildrome(String s) {
        boolean[][] isP = new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--)
            for(int j=i;j<s.length();j++){
                if(i==j || (s.charAt(i)==s.charAt(j) && (j-i<=2 || isP[i+1][j-1])))
                    isP[i][j]=true;
            }
        return isP;
    }
}