public class Solution {
    
   public boolean canJump(int[] nums) {
       int curr = 0;
       
       for (int i = 0; i < nums.length; i ++) {
           if (curr < i) return false;
           curr = Math.max(curr, nums[i] + i);
       }
       return true;
   }
}