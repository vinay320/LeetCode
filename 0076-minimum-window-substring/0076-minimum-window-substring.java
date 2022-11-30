class Solution {
   
        
    boolean checkforValidSubstring(int[] a1, int[] a2, int n) {
        for (int i = 0; i < n; i++) {
            if (a1[i] < a2[i])
                return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m)
            return "";
        int[] arr = new int[60];
        for (int i = 0; i < n; i++)
            arr[t.charAt(i) - 'A']++;
        int st = 0, end = 0;
        int min = Integer.MAX_VALUE;
        String res = "";
        int[] arr2 = new int[60];
        while (end < m) {
            arr2[s.charAt(end) - 'A']++;
            while (st<=end && checkforValidSubstring(arr2, arr, 60)) {
                if(min>end-st+1){
                    min = end-st+1;
                    res = s.substring(st,end+1);
                }
                arr2[s.charAt(st)-'A']--;
                st++;
            }
            end++;
        }
        return res;
    }
}