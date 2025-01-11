public class QuickSort {

    // Method to perform quicksort
    public void quickSort(int[] array, int low, int high) {
        System.out.println("low: "+low+" high: "+high);
        if(low>high){
            return;
        }
        int pivot = array[high];
        int idx = partition(array, low, high,pivot);
        System.out.println("idx: "+idx);
        quickSort(array, low, idx-1);
        quickSort(array, idx+1, high);
    }
 
    // Method to partition the array
    public int partition(int[] array, int low, int high,int pivot) {
        int i = low,j = low;
        while(i<=high){
            System.out.println("i: "+i+" j: "+j);
            if(array[i]>pivot){
                i++;
            }
            else{
                swap(array,i,j);
                i++;
                j++;
            }
        }
        
        return (j-1);
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Main method to test the quicksort algorithm
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Unsorted array:");
        printArray(array);

        sorter.quickSort(array, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}