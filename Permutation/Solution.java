public class Solution {
    
    ArrayList<List<Integer>> a = new ArrayList<List<Integer>>(); 
    
    public List<List<Integer>> permute(int[] nums) {
        aux(nums, 0); 
        return a;
    }
    
    private void aux(int[] n, int in) {
        if (in == n.length) {
            ArrayList<Integer> b = new ArrayList<Integer>();
            a.add(b); 
        } 
        else {
            int first = n[in]; 
            aux(n, in + 1); 
        
            ArrayList<List<Integer>> temp = new ArrayList<List<Integer>>();
        
            for (int i = 0; i < a.size(); i ++) {
                for (int j = 0; j <= a.get(i).size(); j ++) {
                    ArrayList<Integer> t = new ArrayList<Integer>();
                    t.addAll(a.get(i));
                    t.add(j, n[in]);
                    temp.add(t); 
                }
            } 
            a = temp;
        }
    }
}