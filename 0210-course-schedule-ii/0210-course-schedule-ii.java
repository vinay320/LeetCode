
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<numCourses;i++)
        {
            mp.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++)
        {
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            mp.get(v2).add(v1);
        }
        return Topologica_sort(mp);
        
        
        
    }
    
    public static int[] Topologica_sort(HashMap<Integer,List<Integer>> mp)
    {
        int[] in=Indegree(mp);
        Queue<Integer> q=new LinkedList<>();
        int[] arr=new int[in.length];
        for(int  i=0;i<in.length;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        int c=0;
        
        while(!q.isEmpty())
        {
            
            int rv=q.poll();
            arr[c++]=rv;
            for(int nbrs:mp.get(rv))
            {
                in[nbrs]--;
                if(in[nbrs]==0)
                {
                    q.add(nbrs);
                }

            }
        }

        return c!=mp.size()?new int[]{}:arr;
    }

    public static int[] Indegree(HashMap<Integer,List<Integer>> mp)
    {
            // in this we will increse the value of nber value by one while traversing all values
            int[] In=new int[mp.size()];
            for(int key:mp.keySet())
            {
                for(int nbrs:mp.get(key))
                {
                    In[nbrs]++;
                }
            }
            return In;
    }
}