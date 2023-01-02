class Solution {
    public int maxRotateFunction(int[] A) {
        
        int  n=A.length;
        int sum=0;
	    int sum2=0;
	    
	    for(int i=0;i<A.length;i++)
	    {
	        sum+=A[i];
	        sum2+=A[i]*i;
	    }
	    
	    int max=sum2;
	    int s=sum2;
	    
	    for(int i=0;i<n-1;i++)
	    {
	        int si=s+sum-n*A[n-i-1];
	        if(si>max)
	        {
	            max=si;
	        }
	        
	        s=si;
	    }
	    
	    
	    return max;
    }
    
  
}