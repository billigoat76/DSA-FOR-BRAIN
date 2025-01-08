public class MergeTwoSortedArrays {
    /**
     * The main method to demonstrate the merging of two sorted arrays.
     * 
     * Example usage:
     * int[] nums1 = {1, 2, 3, 0, 0, 0};
     * int[] nums2 = {2, 5, 6};
     * int m = 3;
     * int n = 3;
     * 
     * merge(nums1, m, nums2, n);
     * 
     * This will merge nums2 into nums1 resulting in a single sorted array.
     * 
     * Time Complexity: O(m + n) where m is the number of initialized elements in nums1 and n is the number of elements in nums2.
     * Space Complexity: O(1) as the merging is done in-place.
     */
    public static void main(String[] args) {
        // Example usage
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1 , k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
    }
    }
