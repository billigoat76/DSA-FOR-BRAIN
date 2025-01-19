import java.io.*;
import java.util.*;
/*
     * Algorithm:
     * 1. Calculate the range of elements (max - min + 1).
     * 2. Create a frequency array (farr) of size 'range' to store the count of each element.
     * 3. Convert the frequency array to a prefix sum array, which helps to determine the
     *    final positions of elements in the sorted array.
     * 4. Use the prefix sum array to place each element from the input array into its
     *    correct position in a result array.
     */
public class CountSort {

    public static void countSort(int[] arr, int min, int max) {
        // Write your code here
      int range = max - min + 1;
      int[] farr = new int[range];
      for(int i=0;i<arr.length;i++){
        farr[arr[i]-min]++;
      }
      farr[0]--;
      for(int i=1;i<farr.length;i++){
        farr[i] = farr[i]+farr[i-1];
      }

      for(int i=arr.length-1;i>=0;i--){
        int ele = arr[i];
        arr[farr[ele-min]] = ele;
        farr[ele-min]--;
       }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        countSort(arr, min, max);
        print(arr);
    }
}
