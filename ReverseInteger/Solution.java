public class Solution {
    public int reverse(int x) {
        
        boolean negative = (x > 0) ? false : true; 
        
        long val = 0, n = 0; 
        
            while (x != 0) {
                val *= 10; 
                val += x % 10; 
                
                if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) return 0;
                x /= 10; 
            }
        
            return (negative && val > 0)? (int)-val : (int)val;
    }
}