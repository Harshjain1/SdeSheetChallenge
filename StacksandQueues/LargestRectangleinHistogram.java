//TC -> O(n)
//SC -> O(n)
import java.util.ArrayList;
import java.util.*;
public class Solution {
    
    public static int[] leftsmallerindex(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        while(st.size()>0){
            res[st.pop()] = -1;
        }
        return res;
    }
    
    public static int[] rightsmallerindex(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        while(st.size()>0){
            res[st.pop()] = n;
        }
        return res;
    }
    
  public static int largestRectangle(ArrayList<Integer> heights) {
      int n = heights.size();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
          arr[i] = heights.get(i);
      }
      int[] lsi = leftsmallerindex(arr);
      int[] rsi = rightsmallerindex(arr);
      int maxarea = 0;
      for(int i=0;i<n;i++){
          int length = rsi[i]-lsi[i]-1;
          int breadth = arr[i];
          maxarea = Math.max(maxarea,length*breadth);
      }
      return maxarea;
  }
}
