class Solution {
    public boolean wordPattern(String pattern, String s) {
        
         HashMap<String,String> map = new HashMap<String,String>();
        
        String[] arr1=pattern.split("");
        String[] arr2=s.split(" ");
        
        if(arr1.length!=arr2.length)
        {
            
            return false;
        }
        
        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                if(!map.get(arr1[i]).equals((arr2[i])))
                {
                    //System.out.println("false");
                    return false;
                }
                
            }
            else if(map.containsValue(arr2[i]))
            {
                return false;
            }
            else
            {
                map.put(arr1[i],arr2[i]);
                
            }
        }
        
        
        return true;
    }
}