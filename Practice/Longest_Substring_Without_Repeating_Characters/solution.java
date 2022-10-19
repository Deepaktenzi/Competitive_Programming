package Longest_Substring_Without_Repeating_Characters;
import java.util.*;
public class solution{
    static int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;
        int max = 0;
        HashSet<Character> hash = new HashSet<>();
    
        while(r < s.length())
                {
                if(!hash.contains(s.charAt(r)))
                        {
                            hash.add(s.charAt(r++));
                            max = Math.max(max, hash.size());
                        }
                else{
                    hash.remove(s.charAt(l++));
                     }
                }
        return max;
    }
    public static void main(String args[]){
        String ans = "abcabcbb";
        
        System.out.println(lengthOfLongestSubstring(ans));
    }
}
