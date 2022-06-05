import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int target)  {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            int val = arr[i];
            int ntarget = target-val;
            ArrayList<ArrayList<Integer>> ans = twosum(arr,i+1,ntarget);
            for(ArrayList<Integer> list : ans){
                list.add(val);
                res.add(list);
            }
        }
        return res;
	}
    
    public static ArrayList<ArrayList<Integer>> twosum(int[] arr,int st,int target){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int lo = st;
        int hi = arr.length-1;
        while(lo<hi){
            if(lo!=st && arr[lo]==arr[lo-1]){
                lo++;
                continue;
            }
            int sum = arr[lo]+arr[hi];
            if(sum==target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(arr[lo]);
                ans.add(arr[hi]);
                lo++;
                hi--;
                res.add(ans);
            }
            else if(sum>target){
                hi--;
            }
            else{
                lo++;
            }
        }
        return res;
    }
}
