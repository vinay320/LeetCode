class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int n1 = s.length();
       int n2 = p.length();
        if (n1 < n2)
        {
            return new ArrayList();
        }
            
        int[] count1 = new int[128];
        int[] count2 = new int[128];
        for (char ch : p.toCharArray())
        {
            count1[ch]++;
        }

        List<Integer> output = new ArrayList();
        for (int i = 0; i < n1; ++i) 
        {
            char ch = s.charAt(i);
            count2[ch]++;
 
            if (i >= n2) 
            {
                ch = s.charAt(i - n2);
                if (count2[ch] > 0) 
                {
                    count2[ch]--;
                }
            }

            if (Arrays.equals(count1,count2)) 
            {
                output.add(i - n2 + 1);
            }
        }
        return output;
    }
}