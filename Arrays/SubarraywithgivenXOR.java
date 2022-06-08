//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		HashMap<Integer,Integer> mp = new HashMap<>();
        int xor = 0;
        int count = 0;
        for(int val : arr){
            xor = xor^val;
            if(xor==x){
                count++;
            }
            if(mp.containsKey(xor^x)){
                count += mp.get(xor^x);
            }
            if(mp.containsKey(xor)){
                mp.put(xor,mp.get(xor)+1);
            }
            else{
                mp.put(xor,1);
            }
        }
        return count;
	}
}
