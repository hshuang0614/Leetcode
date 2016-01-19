public class Solution {
    public int removeElement(int[] nums, int val) {
        
        int a = 0, b = 0; 
        
        while (b < nums.length) {
            if (nums[b] != val) {
                nums[a++] = nums[b];
            }
            b++; 
        }
        
        return a;     
    }
}