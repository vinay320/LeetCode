class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
    
    public static boolean Topologica_sort(HashMap<Integer,List<Integer>> mp)
    {
        int[] in=Indegree(mp);
        Queue<Integer> q=new LinkedList<>();
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
            c++;
            int rv=q.poll();
            System.out.print(rv+" ");
            for(int nbrs:mp.get(rv))
            {
                in[nbrs]--;
                if(in[nbrs]==0)
                {
                    q.add(nbrs);
                }

            }
        }

        return mp.size() == c;
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