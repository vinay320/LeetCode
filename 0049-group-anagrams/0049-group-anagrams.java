class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String i:strs)
        {
            int[] arr=new int[26];
            for(int x=0;x<i.length();x++)
            {
                arr[i.charAt(x)-'a']++;
            }
            StringBuilder s=new StringBuilder();
            for(int ch:arr)
            {
                s.append(ch+" ");
            }
            List<String> l=m.getOrDefault(s.toString(),new ArrayList<>());
            l.add(i);
            m.put(s.toString(),l);
        }
        List<List<String>> a=new ArrayList<>();
        for(String s:m.keySet())
        {
            a.add(m.get(s));
        }
        return a;
    }
}