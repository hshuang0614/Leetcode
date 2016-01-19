public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2]; 
        
        int start = 0, end = nums.length - 1, a = -1, b = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] > target) 
                  end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
                
            else {
                a = mid; b = mid; 
                while (a > 0 && nums[a - 1] == target) 
                    a--; 
                while (b < nums.length - 1 && nums[b + 1] == target)
                    b++;
                break;
            }
        }
        
        arr[0] = a;
        arr[1] = b;
        
        return arr;
    }
}