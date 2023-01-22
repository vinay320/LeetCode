class Solution {
    public List<List<String>> partition(String s) {
        List<String> la=new ArrayList<>();
        parti(s,la);
        return l;
    }
    
    List<List<String>> l=new ArrayList<>();
   
     boolean pal(String x)
    {
        for(int i=0;i<x.length()/2;i++)
        {
            if(x.charAt(i)!=x.charAt(x.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
     void parti(String s,List<String> la)
    {
        if(s.length()==0)
        {
            
            // String[] arr=a.split(" ");
            // List<String> la=new ArrayList<>();
            // for (int i = 0; i < arr.length ; i++) {
            //     la.add(arr[i]);
            // }
            l.add(new ArrayList<>(la));
           
            return;
        }
        for (int i=1;i<=s.length();i++)
        {
            String x=s.substring(0,i);
            if(pal(x))
            {
                la.add(x);
                parti(s.substring(i),la);
                la.remove(la.size()-1);
                
                
            }

        }
    }
}