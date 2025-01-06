import java.util.Arrays;

public class SelectionSort {

    /**
     * Sorts the given array using the selection sort algorithm.
     * 
     * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
     * (considering ascending order) from the unsorted part and putting it at the beginning. 
     * The algorithm maintains two subarrays in a given array:
     * 1. The subarray which is already sorted.
     * 2. The remaining subarray which is unsorted.
     * 
     * In every iteration of the selection sort, the minimum element from the unsorted subarray 
     * is picked and moved to the sorted subarray.
     * 
     * Time Complexity: O(n^2) - where n is the number of elements in the array.
     * This is because there are two nested loops: one for iterating over the array and 
     * another for finding the minimum element in the unsorted part.
     * 
     * Space Complexity: O(1) - The algorithm sorts the array in place, requiring only a 
     * constant amount of additional memory space.
     * 
     * @param array the array to be sorted
     */
    public static void selectionsort(int[] array) {
        // Your logic here
        int n = array.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(isSmaller(array,j,min)){
                    min = j;
                }
            }
           
            
            swap(array,i,min);
            
        }
    }

    public static boolean isSmaller(int[] arr, int i ,int j){
        if(arr[i]<arr[j]){
            return true;
        }
        return false;
    }

    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        selectionsort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}