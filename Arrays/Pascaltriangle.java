//TC -> O(n^2)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
         ArrayList<ArrayList<Long>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            long ncr = 1;
            ArrayList<Long> ans = new ArrayList<>();
            for(int j=0;j<=i;j++){
                ans.add(ncr);
                long ncr1 = (i-j)*ncr/(j+1);
                ncr = ncr1;
            }
            res.add(ans);
        }
        return res;
	}
}
