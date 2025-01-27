import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '['|| c == '{'){
                stk.push(c);
            }
            else{
                if(stk.isEmpty() || 
                (c == ')' && stk.pop() != '(') ||
                (c == ']' && stk.pop() != '[') ||
                (c == '}' && stk.pop() != '{')){
                    return false;
                }
            }          
        }
        return stk.isEmpty();
    }
}