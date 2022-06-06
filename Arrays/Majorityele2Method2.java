//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr){
        ArrayList<Integer> res = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int res1 = -1;
        int res2 = -1;
        for(int val : arr){
            if(val==res1){
                c1++;
            }
            else if(val==res2){
                c2++;
            }
            else if(c1==0){
                c1 = 1;
                res1 = val;
            }
            else if(c2==0){
                c2 = 1;
                res2 = val;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int val : arr){
            if(val==res1){
                c1++;
            }
            else if(val==res2){
                c2++;
            }
        }
        int n = arr.size();
        if(c1>n/3){
            res.add(res1);
        }
        if(c2>n/3){
            res.add(res2);
        }
        return res;
    }
}
