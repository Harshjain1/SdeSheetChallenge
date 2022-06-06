//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int val : arr){
            if(mp.containsKey(val)){
                mp.put(val,mp.get(val)+1);
            }
            else{
                mp.put(val,1);
            }
        }
        int n = arr.size();
        for(int key : mp.keySet()){
            int val = mp.get(key);
            if(val>n/3){
                res.add(key);
            }
        }
        return res;
    }
}
