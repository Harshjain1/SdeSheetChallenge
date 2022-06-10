//TC -> O(n)
//SC -> O(n)
import java.util.*;
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
	
public class Solution {
	public static int findCelebrity(int n) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int x = st.pop();
            int y = st.pop();
            if(Runner.knows(x,y)){
                st.push(y);
            }
            else{
                st.push(x);
            }
        }
        int res = st.pop();
        for(int i=0;i<n;i++){
            if(Runner.knows(res,i) && res!=i){
                return -1;
            }
        }
        for(int i=0;i<n;i++){
            if(!Runner.knows(i,res) && res!=i){
                return -1;
            }
        }
        return res;
    }
}
