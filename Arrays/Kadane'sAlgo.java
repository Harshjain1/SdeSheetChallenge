//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxsum = 0;
        long sum = 0;
        for(int val : arr){
            sum += val;
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxsum;
	}

}
