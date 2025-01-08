/**
 * This class provides an implementation of the Merge Sort algorithm.
 */
public class MergeSort {

    /**
     * Sorts the given array using the Merge Sort algorithm.
     *
     * @param nums the array to be sorted
     * @return the sorted array
     */
    public int[] sortArray(int[] nums) {
        // The time complexity of this code is O(n log n)
        int l = 0 , r = nums.length-1;
        return mergeSort(nums,l,r);
    }

    /**
     * Recursively sorts the subarray from index l to r using the Merge Sort algorithm.
     *
     * @param nums the array to be sorted
     * @param l the starting index of the subarray
     * @param r the ending index of the subarray
     * @return the sorted subarray
     */
    public int[] mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return new int[]{nums[l]};
        }
        int mid = (l + (r-l)/2);
        int[] fsh = mergeSort(nums,l,mid);
        int[] ssh = mergeSort(nums,mid+1,r);
        int[] merged = mergeTwoSortedArrays(fsh,ssh);
        return merged;
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param a the first sorted array
     * @param b the second sorted array
     * @return the merged sorted array
     */
    public int[] mergeTwoSortedArrays(int[] a,int[] b){
        int[] merged = new int[a.length+ b.length];
        int i = 0 ,j = 0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merged[k] = a[i];
                i++;
            }
            else{
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }

    /**
     * The main method to test the Merge Sort algorithm.
     *
     * @param args command line arguments
     */
   
            System.out.print(num + " ");
        }
    }
}