class Solution {
int[][] dp;
public int minInsertions(String s) {
    dp = new int[s.length()][s.length()];
    return recursion(s, 0, s.length()-1);
}

int recursion(String s, int start, int end){
    if(start == end){
        return 0;
    }
    if(start == end+1){
        if(s.charAt(start) == s.charAt(end)){
            return 0;
        }
        else{
            return 2;
        }
    }
    
    if(dp[start][end] != 0){
        return dp[start][end];
    }
    int retVal = 100000;
    //System.out.println(start +"    "+ end);
    if(s.charAt(start) == s.charAt(end)){
        retVal = Math.min(retVal, recursion(s, start+1, end-1));
    }
    else{
        if(start == (s.length()-1-end)){
            retVal = Math.min(retVal, 1+recursion(s, start, end-1));
        }
        else{
            retVal = Math.min(retVal, 1+recursion(s, start+1, end));
        }
        
        if(start == (s.length()-1-end)){
            retVal = Math.min(retVal, 1+recursion(s, start+1, end));
        }
        else{
            retVal = Math.min(retVal, 1+recursion(s, start, end-1));
        }
    }
    dp[start][end] = retVal;
    return retVal;
}
}