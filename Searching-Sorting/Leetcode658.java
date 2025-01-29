import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode658 {
    class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : arr){
            if(pq.size()<k){
                pq.add(num);
            }
            else{
                if(Math.abs(pq.peek()-x) > Math.abs(num-x)){
                    pq.poll();
                    pq.add(num);
                }
            }
        }

        while(pq.size()>0){
            ans.add(pq.poll());
        }
        return ans;
    }
}
}
