//TC -> O(n)
//SC -> O(n)
import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String str) {
        if(str.length()==0){
            return true;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.isEmpty() || st.peek()!='('){
                    return false;
                }
                st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty() || st.peek()!='['){
                    return false;
                }
                st.pop();
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
            else{
                continue;
            }
        }
        return st.size()==0;
    }
}
