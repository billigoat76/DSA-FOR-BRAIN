public class Leetcode34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            int l = 0, h = nums.length-1;
            while(l<=h){
                int m = l+(h-l)/2;
                if(nums[m]>target){
                    h = m-1;
                }    
                else if(nums[m]<target){
                    l = m+1;
                }
                else{
                    ans[0] = m;
                    h = m-1;
                }
            }
            l = 0 ;
             h = nums.length-1;
            while(l<=h){
                int m = l+(h-l)/2;
                if(nums[m]>target){
                    h = m-1;
                }
                else if(nums[m]<target){
                    l = m+1;
                }
                else{
                    ans[1] = m;
                    l  = m+1;
                }
            }
            return ans;
        }
    }
}
