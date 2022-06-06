//Moore's Voting Algo
//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count = 0;
        int res = -1;
        for(int val : arr){
            if(val==res){
                count++;
            }
            else if(count==0){
                count = 1;
                res = val;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int val : arr){
            if(val==res){
                count++;
            }
        }
        return count>n/2?res:-1;
	}
}
