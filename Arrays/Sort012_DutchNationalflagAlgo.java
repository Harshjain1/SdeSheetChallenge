//TC -> O(n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
        return ;
    }
    
    public static void swap(int[] arr,int idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
