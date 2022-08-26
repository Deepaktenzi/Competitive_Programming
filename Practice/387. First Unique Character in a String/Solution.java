import java.util.HashMap;

public class Solution {

    static int firstUniqChar(String s) {
        
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            hashmap.put(key, hashmap.getOrDefault(key, 0)+1);
        }

       for (int i = 0; i < s.length(); i++) {
           if(hashmap.get(s.charAt(i))==1){
               return 1;
           }
       }
       return -1;
    }   
    public static void main(String[] arg){
        String s = "leetcode";
        
        System.out.println(firstUniqChar(s)); 
    }
}
