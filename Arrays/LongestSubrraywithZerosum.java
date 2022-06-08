//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int len = 0;
        int sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);
            if(sum==0){
                len = i+1;
            }
            if(mp.containsKey(sum)){
                len = Math.max(len,i-mp.get(sum));
            }
            else{
                mp.put(sum,i);
            }
        }
        return len;
	}
}
