//TC -> O(n)
//SC -> O(n)
import java.util.*;
public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
		st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<arr[i]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(st.size()>0){
            res[st.pop()] = -1;
        }
        return res;
	}

}
