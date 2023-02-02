class Solution {
    public int orangesRotting(int[][] grid) {
        int c=0;
         List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    c++;
                }
            }
        }
        if(c==0)
        {
            return 0;
        }
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                {
                    List<Integer> l1=new ArrayList<>();
                          l1.add(i);
                          l1.add(j);
                         l.add(new ArrayList<>(l1));
                }
            }
        }
       
        int min=0;

        List<List<Integer>> temp=new ArrayList<>();
        temp=l;
        
        while(temp.size()>0)
        {
            l=temp;
            temp=new ArrayList<>();
            while(l.size()>0)
        {   
            
            List<Integer> x=l.remove(0);
            boolean d1=false;
            boolean d2=false;
            boolean d3=false;
            boolean d4=false;
               
                if(grid[x.get(0)][x.get(1)]==2)
               {
                   if(x.get(1)-1>=0 && grid[x.get(0)][x.get(1)-1]==1)
                   {
                       List<Integer> l1=new ArrayList<>();
                       l1.add(x.get(0));
                       l1.add(x.get(1)-1);
                       temp.add(new ArrayList<>(l1));
                       grid[x.get(0)][x.get(1)-1]=2;
                       d2=true;
                       c--;
                   }
                    if(x.get(0)-1>=0 && grid[x.get(0)-1][x.get(1)]==1)
                   {
                       List<Integer> l1=new ArrayList<>();
                       l1.add(x.get(0)-1);
                       l1.add(x.get(1));
                       temp.add(new ArrayList<>(l1));
                       grid[x.get(0)-1][x.get(1)]=2;
                       d1=true;
                    c--;   
                   }
                   
                   if(x.get(0)+1<grid.length && grid[x.get(0)+1][x.get(1)]==1)
                   {
                       List<Integer> l1=new ArrayList<>();
                       l1.add(x.get(0)+1);
                       l1.add(x.get(1));
                       temp.add(new ArrayList<>(l1));
                       grid[x.get(0)+1][x.get(1)]=2;
                       c--;
                       d3=true;
                   }
                   if(x.get(1)+1<grid[0].length && grid[x.get(0)][x.get(1)+1]==1)
                   {
                       List<Integer> l1=new ArrayList<>();
                       l1.add(x.get(0));
                       l1.add(x.get(1)+1);
                       temp.add(new ArrayList<>(l1));
                       grid[x.get(0)][x.get(1)+1]=2;
                       c--;
                       d4=true;
                   }
               }
                        
               // if(d1 || d2 || d3 || d4)
               // {
               //     min++;
               // }
            
        }
            if(temp.size()>0)
            {
                min++;
            }
            
        }
        
        if(c!=0)
        {
            return -1;
        }
        
        return min;
    }
}