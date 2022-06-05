//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		int idx = -1;
        int n = arr.size();
        for(int i=n-2;i>=0;i--){
            if(arr.get(i+1)>arr.get(i)){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            reverse(arr,0,n-1);
            return arr;
        }
        for(int i=n-1;i>idx;i--){
            if(arr.get(i)>arr.get(idx)){
                int temp = arr.get(i);
                arr.set(i,arr.get(idx));
                arr.set(idx,temp);
                reverse(arr,idx+1,n-1);
                return arr;
            }
        }
        return new ArrayList<>();
	}
    
    public static void reverse(ArrayList<Integer> arr,int lo,int hi){
        while(lo<hi){
            int temp = arr.get(lo);
            arr.set(lo,arr.get(hi));
            arr.set(hi,temp);
            lo++;
            hi--;
        }
        return;
    }
}
