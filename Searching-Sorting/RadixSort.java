public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void radixSort(int[] nums) {
        int m = Integer.MIN_VALUE;
        for(int num : nums){
            m = Math.max(m,num);
        }
        int exp = 1;
        while(exp<=m){
            countSort(nums,exp);
            exp*=10;
        }
    }

    public static void countSort(int[] nums,int exp){
        int[] farr = new int[10];
        for(int i=0;i<nums.length;i++){
            farr[nums[i]/exp%10]++;
        }
        farr[0]--;
        for(int i=1;i<nums.length;i++){
            farr[i] += farr[i-1];
        }

        int[] ans = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int dig = nums[i]/exp%10;
            ans[farr[dig]] = nums[i];
            farr[dig]--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}
