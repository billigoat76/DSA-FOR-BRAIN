import java.util.Arrays;

public class MaxValuePermutation {
    
class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int modulo = 1000000007;
        long sum = 0;
        Arrays.sort(arr);
        for(int  i=0;i<arr.length;i++){
            sum += ((long)i*arr[i]) % modulo;
            
        }
        return (int) (sum % modulo);
    }
}

}
