public class Rooftop {
    
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int steps = 0;
        int maxSteps = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                steps +=1;
                maxSteps = Math.max(steps,maxSteps);
            }
            else{
                steps = 0;
            }
        }
        return maxSteps;
    }
}
}
