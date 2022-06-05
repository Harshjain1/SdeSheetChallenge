//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxpro = 0;
        int minval = prices.get(0);
        for(int i=1;i<prices.size();i++){
            maxpro = Math.max(maxpro,prices.get(i)-minval);
            minval = Math.min(minval,prices.get(i));
        }
        return maxpro;
    }
}
