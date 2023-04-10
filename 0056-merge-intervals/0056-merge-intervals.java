class Solution {   
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        if(intervals.length==0 || intervals==null)
        {
            return res.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int st=intervals[0][0];
        int ed=intervals[0][1];
        
        for(int[] i:intervals)
        {
            if(i[0]<=ed)
            {
                ed=Math.max(ed,i[1]);
            }
            else
            {
                res.add(new int[]{st,ed});
                st=i[0];
                ed=i[1];
            }
        }
        res.add(new int[]{st,ed});        
        return res.toArray(new int[0][]);
    }
}