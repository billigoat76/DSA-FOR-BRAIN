
public class ArrayPartition {

    public static void main(String[] args) {
        
        int[] array = { 54,6,21,3,-4,-97,67,89,98,104};
        int pivot = 45;
        
        partitionArray(array, pivot);
        
        // Print the partitioned array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void partitionArray(int[] array, int pivot) {
        // Your partition logic goes here
        int i =0 , j = 0;
        for(int num : array){
            if(num>pivot){
                j++;
            }
            else{
                swap(array,i,j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
