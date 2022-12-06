class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int start = 0;
        int i = start;
        while(start<word.length()-4)
        {
            if(i==word.length()){
                start++;
                i=start;
            }
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            {
                if(word.substring(start,i+1).contains("a") && word.substring(start,i+1).contains("e") && word.substring(start,i+1).contains("i") &&           
                   word.substring(start,i+1).contains("o") && 
                   word.substring(start,i+1).contains("u"))
                {
                    count++;
                }
                i++;
                
            }else{
                
                start++;
                i=start;
            }
        }
        return count;
    }
}
