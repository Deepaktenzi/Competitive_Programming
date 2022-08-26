import java.util.*;
public class solution {

    static int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int i = 0; i < k; i++){
                pq.add(nums[i]);     
            }
            for(int i = k; i<nums.length;i++){
                if(pq.peek()< nums[i]){
                    System.out.println("Value Delete : "+ pq.poll());
                    
                    System.out.println("Value Added : " + pq.add(nums[i]));
                    
                }
            }
        System.out.println(pq.peek());
        return pq.peek();
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        int k = 4;
        findKthLargest(num,k);
    }
}