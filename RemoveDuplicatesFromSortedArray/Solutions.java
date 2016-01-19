public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 
        
        int ptr1 = 0, ptr2 = 1; 
        
        while (ptr2 < nums.length) {
            if (nums[ptr2] != nums[ptr2 - 1])
                nums[++ptr1] = nums[ptr2]; 
            
            ptr2++; 
        }
        
        return 1 + ptr1; 
    }
}