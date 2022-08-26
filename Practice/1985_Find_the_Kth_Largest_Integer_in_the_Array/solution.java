import java.math.BigInteger;
import java.util.*;
public class solution {

     static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
       int n = nums.length;
        for(int i =0; i<n;i++){
            pq.add(new BigInteger(nums[i])); 
        }

        int limit = n-k+1;
        BigInteger num = null;
        for(int i =0; i<limit;i++){
             num = pq.poll();  
        }

        return num.toString();
    }
    public static void main(String[] args) {
        
        String nums[] = {"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
        int k = 11;
       
        System.out.println(kthLargestNumber(nums,k));
    }
}
