//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> st = new HashSet<>();
        for(int val : arr){
            st.add(val);
        }
        int ans = 1;
        for(int val : arr){
            if(st.contains(val-1)==false){
                int curr = val;
                int len = 1;
                while(st.contains(curr+1)){
                    curr++;
                    len++;
                }
                ans = Math.max(len,ans);
            }
        }
        return ans;
    }
}
