public class Leetcode153 {
    class Solution {
        public int findMin(int[] arr) {
            int ans = Integer.MAX_VALUE, l = 0, h = arr.length-1;
            while(l<=h){
                int m = l+(h-l)/2;
                if(arr[l]<=arr[m]){
                    ans = Math.min(ans,arr[l]);
                    l = m+1;
                }
                else {
                    ans = Math.min(ans,arr[m]);
                    h = m-1;
                }
            }
            return ans;
        }
    }
}
