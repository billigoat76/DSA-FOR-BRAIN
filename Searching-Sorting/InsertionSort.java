public class InsertionSort {
    
        /**
         * Sorts the given array using the insertion sort algorithm.
         * 
         * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
         * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
         * 
         * The algorithm works as follows:
         * 1. Iterate from the second element to the last element.
         * 2. For each element, compare it with the elements before it and insert it into its correct position.
         * 3. Repeat until the array is sorted.
         * 
         * Time Complexity:
         * - Best case: O(n) when the array is already sorted.
         * - Average case: O(n^2) due to the nested loops.
         * - Worst case: O(n^2) when the array is sorted in reverse order.
         * 
         * Space Complexity:
         * - O(1) as it is an in-place sorting algorithm.
         * 
         * @param array the array to be sorted
         */
        public static void insertionSort(int[] array) {
            // Logic for insertion sort goes here
            int n  = array.length;
            for(int i=1;i<n;i++){
                for(int j=i-1;j>=0;j--){
                    if(isGreater(array,j,j+1)){
                        swap(array,j-1,j);
                    }
                    else{
                        break;
                    }
                }
            }
            
        }

        public static boolean isGreater(int[] a, int i, int j){
            if(a[i]>a[j]) return true;
            return false;
        }
        public static void swap(int[] a, int i,int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6};
            insertionSort(array);
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
    

