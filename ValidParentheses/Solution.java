public class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>(); 
        
        for (int i = 0; i < s.length(); i ++) {
            char curr = s.charAt(i); 
            
            if (curr == '}' || curr == ')' || curr == ']') {
                if (st.empty()) return false;
                Character p = st.pop(); 
                  if ((curr == '}' && p != '{') ||
                    (curr == ')' && p != '(') ||
                    (curr == ']' && p != '['))
                return false; 
            }         
            else if (curr == '(' || curr == '[' || curr == '{')
                st.push(curr);  
        }
        
        return st.empty();
    }
}