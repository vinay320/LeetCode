class Solution {
   public List<String> wordBreak(String s, List<String> wordDict) {
        
        List<String> list = new ArrayList<>() ;
        recurs(list , s , wordDict , "");
        return list ;
    }
    public void recurs(List<String> list , String s , List<String> dict , String asf){
        if(s.length() == 0){
            list.add(0 ,asf.trim());
            return ;
        }
		for(int i = 0 ; i < s.length() ; i++){
            String left = s.substring(0 , i+1);
		    if(dict.contains(left)){
                String right = s.substring(i+1);
                recurs(list , right ,dict , asf + left +" ");
            }
        }
    }
}