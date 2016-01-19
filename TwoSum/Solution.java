public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        int a[] = new int[2];         
            
        for (int i = 0; i < nums.length; i ++) 
            if (map.get(nums[i]) == null)
                map.put(target - nums[i], i); 
        
        
        for (int i = 0; i < nums.length; i ++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) != i) {
                a[0] = Math.min(i, map.get(nums[i])) + 1;
                a[1] = Math.max(i, map.get(nums[i])) + 1; 
                break;
            }   
        }
        
        return a;
    }
}