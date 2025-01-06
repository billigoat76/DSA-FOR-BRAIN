/**
 * This class implements the Bubble Sort algorithm.
 * 
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order. The pass
 * through the list is repeated until the list is sorted.
 * 
 * Time Complexity:
 * - Best Case: O(n) - This occurs when the array is already sorted. In this case, the algorithm
 *   will only make one pass through the array to check if it is sorted.
 * - Average Case: O(n^2) - This occurs when the elements are in random order. The algorithm
 *   will need to make multiple passes through the array, and each pass will involve multiple
 *   comparisons and swaps.
 * - Worst Case: O(n^2) - This occurs when the array is sorted in reverse order. The algorithm
 *   will need to make the maximum number of passes through the array, and each pass will involve
 *   the maximum number of comparisons and swaps.
 * 
 * Space Complexity:
 * - O(1) - Bubble Sort is an in-place sorting algorithm, which means it does not require any
 *   additional storage space. The sorting is done within the original array, and only a few
 *   additional variables are used for the swapping process.
 * 
 * Bubble Sort is not suitable for large datasets due to its average and worst-case time complexity.
 * However, it can be useful for small datasets or for educational purposes to understand the
 * basic concepts of sorting algorithms.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Your sorting logic will go here
        for(int i=0;i<n-1;i++){
            for(int j=0 ; j<n-1-i;j++){
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
        }
        
    }

    public static boolean isSmaller(int[]arr , int i,int j){
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

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

