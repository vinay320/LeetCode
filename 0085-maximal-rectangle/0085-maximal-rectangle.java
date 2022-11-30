class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int[] ans=new int[matrix[0].length];
        int area=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                    ans[j]++;
                }
                else
                {
                    ans[j]=0;
                }
            }
            area=Math.max(area,largestRectangleArea(ans));
        }
        
        return area;
        
    }
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