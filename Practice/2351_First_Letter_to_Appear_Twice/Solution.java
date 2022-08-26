import java.util.HashMap;

public class Solution {

    static char repeatedCharacter(String s) {
        char val = '\0';
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            val = s.charAt(i);
            if(hashmap.containsKey(val)){
                    break;
            }
            else{
                hashmap.put(val, 1);
            }
        }
        return val;
    }
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s)); 
    }
    
}
