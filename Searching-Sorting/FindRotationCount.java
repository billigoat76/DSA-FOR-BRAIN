import java.util.List;

public class FindRotationCount {
    class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int l = 0 , h = arr.size()-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr.get(l)<=arr.get(m)){
                if(min>arr.get(l)){
                    min = arr.get(l);
                    minIdx = l;
                }
                l = m+1;
            }
            else{
                if(min>arr.get(m)){
                    min = arr.get(m);
                    minIdx = m;
                }
                h = m-1;
            }
        }
        return minIdx;
    }
}
}
