class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> s=new Stack<>();
        int maxarea=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[i]<arr[s.peek()])
            {
                int h=arr[s.pop()];
                int r=i;
                if(s.isEmpty())
                {
                    maxarea=Math.max(maxarea,h*r);
                }
                else
                {int l=s.peek();
                 maxarea=Math.max(maxarea,h*(r-l-1));   
                }
            }
             s.push(i);
            
        
        }
        int r=arr.length;
        while(!s.isEmpty())
            {
                int h=arr[s.pop()];
                
                if(s.isEmpty())
                {
                    maxarea=Math.max(maxarea,h*r);
                }
                else
                {
                    int l=s.peek();
                 maxarea=Math.max(maxarea,h*(r-l-1));   
                }
            }
       
        
        return maxarea;
    }
    
}