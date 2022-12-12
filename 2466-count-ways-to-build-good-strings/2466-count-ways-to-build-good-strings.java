class Solution {
     final int mod=1000000007;
    public long solve(int i, int zero,int one,long[] arr){
        if(i==0) return 1;
        if(i<0) return 0;
        if(arr[i]!=-1) 
        {
            return arr[i];
        }
        return arr[i]=solve(i-zero,zero,one,arr)%mod + solve(i-one,zero,one,arr)%mod;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        
        long[] arr=new long[100001];
        Arrays.fill(arr,-1);
        
        long ans=0;
        for(int i=low;i<=high;i++){
            ans=ans%mod +solve(i,zero,one,arr);
        }
        return (int)ans%mod;
    }
}