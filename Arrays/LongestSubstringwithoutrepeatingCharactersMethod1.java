//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
        int st = 0;
        int end = 0;
        int len = 0;
        HashSet<Character> hs = new HashSet<>();
        while(end<input.length()){
            char ch1 = input.charAt(end);
            while(hs.contains(ch1) && st<=end){
                char ch2 = input.charAt(st);
                hs.remove(ch2);
                st++;
            }
            hs.add(ch1);
            len = Math.max(len,end-st+1);
            end++;
        }
        return len;
	}
}
