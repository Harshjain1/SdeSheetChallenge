//TC -> O(log(n*m))
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> arr, int m, int n, int target) {
        int lo = 0;
        int hi = n*m-1;
        //n is the column no here
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int x = mid/n;
            int y = mid%n;
            if(arr.get(x).get(y)==target){
                return true;
            }
            else if(arr.get(x).get(y)>target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return false;
	}
}
