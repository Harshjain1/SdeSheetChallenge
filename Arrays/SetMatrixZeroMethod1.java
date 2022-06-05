import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        
        int[] row = new int[n];
        Arrays.fill(row,-1);
        int[] col = new int[m];
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==0 || col[j]==0){
                    arr[i][j] = 0;
                }
            }
        }
      return ;
    }

}
