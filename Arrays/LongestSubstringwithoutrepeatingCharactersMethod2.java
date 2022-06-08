//TC -> O(n)
//SC -> O(n)
import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		HashMap<Character,Integer> mp = new HashMap<>();
        int len = 0;
        int left = 0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(mp.containsKey(ch)){
                left = Math.max(left,mp.get(ch)+1);
            }
            len = Math.max(len,i-left+1);
            mp.put(ch,i);
        }
        return len;
	}
}
