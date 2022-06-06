//TC -> O(n*log(m))
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> arr, int m, int n, int target) {
		for(int i=0;i<m;i++){
            int lo = 0;
            int hi = n-1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(arr.get(i).get(mid)==target){
                    return true;
                }
                else if(arr.get(i).get(mid)>target){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
        }
        return false;
	}
}
