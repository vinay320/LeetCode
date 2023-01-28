class Solution {
    public int countWords(String[] arr1, String[] arr2) {
     Map<String,Integer> m=new HashMap<>();
     for(int i=0;i<arr1.length;i++)
     {
         m.put(arr1[i],m.getOrDefault(arr1[i],0)+1);
         
     }
        
        Map<String,Integer> m1=new HashMap<>();
     for(int i=0;i<arr2.length;i++)
     {
         m1.put(arr2[i],m1.getOrDefault(arr2[i],0)+1);
         
     }
     int c=0;
       
     for(int i=0;i<arr1.length;i++)
     {
         if(m.containsKey(arr1[i]) && m1.containsKey(arr1[i]))
         {
             if(m.get(arr1[i])== 1 && m1.get(arr1[i])==1)
             {
                 c++;
             }
         }
         
     }
        return c;
        
    }
}