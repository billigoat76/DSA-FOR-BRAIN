/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1 , h = n,ans = -1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(guess(m)==-1){
                h = m-1;
            }
            else if(guess(m)==1){
                l = m+1;
            }   
            else{
                ans = m;
                break;
            }
        }
        return ans;
    }
}