public class Leetcode724 {
    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0;
            for(int num : nums){
                sum += num;
            }
    
            int lsum = 0 , rsum = sum;
            for(int i=0;i<nums.length;i++){
                rsum = rsum - nums[i];
                if(lsum==rsum) return i;
                lsum += nums[i];
            }
            return -1;
        }
    }
}
