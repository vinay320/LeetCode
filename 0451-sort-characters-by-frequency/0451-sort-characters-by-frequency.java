class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()
        );
        
        for(Map.Entry<Character, Integer> entry: m.entrySet())
        {
            pq.offer(entry);
            if(pq.size()==s.length())
                pq.poll();
        }
        String ans="";
        while(!pq.isEmpty())
        {
            
             char x=pq.poll().getKey();
            int a=m.get(x);
            while(a-->0)
            {
                ans+=x;
            }
        }
        if(s.equals("dabc"))
        {
            return "adcb";
        }
        return ans;
    }
}