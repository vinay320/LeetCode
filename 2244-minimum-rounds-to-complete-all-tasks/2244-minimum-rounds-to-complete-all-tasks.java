class Solution {
    public int minimumRounds(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        Map<Integer, Integer> mp = new HashMap<>();
 
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        
        for (int count : mp.values()) {
            if (count == 1) {
                return - 1;
            }

            if (count % 3 == 0) {
                sum += count / 3;
            } else {
                sum += count / 3 + 1;
            }
        }

        return sum;
        
    }
}