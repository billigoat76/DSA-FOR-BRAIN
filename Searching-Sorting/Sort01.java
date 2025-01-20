import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,1};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregate0and1(int[] arr) {
        // code here
        int i = 0 , j = 0;
        while(i<arr.length){
            if(arr[i]==0){
                if(arr[j]==1) swap(arr,i,j);
                j++;
            }
            
             i++;
        }
    }
    
    public static void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
