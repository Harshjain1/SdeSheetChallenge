//TC - O(n)+O(n)
//Sc - O(1)
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int val : arr){
            if(val==0){
                c0++;
            }
            else if(val==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int idx = 0;
        while(c0>0){
            arr[idx] = 0;
            idx++;
            c0--;
        }
        while(c1>0){
            arr[idx] = 1;
            idx++;
            c1--;
        }
        while(c2>0){
            arr[idx] = 2;
            idx++;
            c2--;
        }
        return ;
    }
}
