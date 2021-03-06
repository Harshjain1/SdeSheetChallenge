//TC -> O(m+n)
//SC -> O(1)
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m-1;
        int j = n-1;
        int k = arr1.length-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k] = arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while(i>=0){
            arr1[k] = arr1[i];
            k--;
            i--;
        }
        while(j>=0){
            arr1[k] = arr2[j];
            k--;
            j--;
        }
        return arr1;
    }
}
