class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        double x = Math.pow(10,9);
        
        x= x/length;
        x=x/width;
        x=x/height;
        
        
        
        if(( length >= 10000 || width >= 10000 || height >= 10000 || x<=1) &&  mass>= 100)
        {
            return "Both";
        }
        else if(( length >= 10000 || width >= 10000 || height >= 10000 || x<=1))
        {
            return "Bulky";
        }
        else if(mass>=100)
        {
            return "Heavy";
        }
        return "Neither";
    }
}