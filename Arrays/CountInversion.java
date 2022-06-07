//TC -> O(nlong)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        return getcount(arr,0,arr.length-1,new long[arr.length]);
    }
    
    public static long getcount(long[] arr,int st,int end,long[] temp){
        long inv_count = 0;
        int mid;
        if(st<end){
            mid = st + (end-st)/2;
            inv_count += getcount(arr,st,mid,temp);
            inv_count += getcount(arr,mid+1,end,temp);
            inv_count += countvalue(arr,st,mid+1,end,temp);
        }
        return inv_count;
    }
    
    public static long countvalue(long[] arr,int st,int mid,int hi,long[] temp){
        long count = 0;
        int i = st;
        int j = mid;
        int k = st;
        while(i<=(mid-1) && j<=hi){
            if(arr[i]>arr[j]){
                count += (mid-i);
                temp[k] = arr[j];
                k++;
                j++;
            }
            else{
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
        while(i<=(mid-1)){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j<=hi){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(i=st;i<=hi;i++){
            arr[i] = temp[i];
        }
        return count;
    }
}









