//TC -> O(n)
//Sc -> O(n)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashSet<Integer> st = new HashSet<>();
        for(int val : arr){
            if(st.contains(val)){
                return val;
            }
            else{
                st.add(val);
            }
        }
        return 0;
    }
}
