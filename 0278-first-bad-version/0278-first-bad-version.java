/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    int ans = -1;
    public int firstBadVersion(int n) {
        int l = 0 , h = n-1;
        while(l<=h){
            int m = l+((h-l)/2);
            if(isBadVersion(m+1)){
               h = m-1;
               ans = m+1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
}