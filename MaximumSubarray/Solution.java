public class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = 0, d = nums[0], d1 = d; 
        
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i - 1], 0);
            d = Math.max(d1, nums[i] + max); 
            d1 = d; 
        }
        return d;    
    }
}