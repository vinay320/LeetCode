class Solution {
    public int minMovesToMakePalindrome(String s) {
        int ans=0;
        char arr[]=s.toCharArray();
        int i=0; 
        int j=arr.length-1;
        while(i<j){
            int high=j;
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                while(arr[i]!=arr[high]){
                    high--;
                }
                
                if(i==high) {
                 swap(arr,high,high+1);  // mid elememt
                   ans++;
                continue;
                    }
                
                else{
                
                 while(high<j){  
                    swap(arr,high,high+1);
                    ans++;
                    high++;
                }
            }
            }
        }
        return ans;
        
    }
    
    public static void swap(char ch[],int i,int j){
        
        char t=ch[i];
        ch[i]=ch[j];
        ch[j]=t;
    }
}