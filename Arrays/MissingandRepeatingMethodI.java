//TC -> O(n)
//SC -> O(n)+O(n)
import java.util.ArrayList;
import java.util.*;
public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashSet<Integer> st = new HashSet<>();
        int rep = 0;
        boolean[] vis = new boolean[n];
        for(int val : arr){
            if(st.contains(val)){
                rep = val;
            }
            st.add(val);
            vis[val-1] = true;
        }
        int mis = 0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                mis = i+1;
            }
        }
        return new int[]{mis,rep};
    }
}
