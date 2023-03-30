class Solution {
    public int longestCycle(int[] edges) {
        
        int[] in=new int[edges.length];
        for(int i=0;i<in.length;i++)
        {
            if(edges[i]!=-1)
            {
                in[edges[i]]++;
            }
        }

        boolean[] vis=new boolean[in.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int rv=q.poll();
            vis[rv]=true;
            
            int nbrs=edges[rv];
            if(nbrs!=-1)
            {
                in[nbrs]--;
                if(in[nbrs]==0)
                {
                    q.add(nbrs);
                }
            }
    
        }

        int ans=-1;
        for(int i=0;i<vis.length;i++)
        {
            if(!vis[i])
            {
                int c=1;
                int nbrs=edges[i];
                vis[i]=true;
                while(nbrs!=i)
                {
                    vis[nbrs]=true;
                    c++;
                    nbrs=edges[nbrs];
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}