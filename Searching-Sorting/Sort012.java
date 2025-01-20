class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = 0 , k = nums.length-1;
        // 0 to (j-1) belongs to 0's
        // j to (i-1) belongs to 1's
        // i to k is  unknown territory

        while(i<=k){
            if(nums[i]==0){
                if(nums[j]==1) swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,k);
                k--;
            }

        }
    }

    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}