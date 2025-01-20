public class SortDate {
    Public static void main(String[] args) {
        // Date is in ddmmyyyy format 
        int[] dates = {12011996, 20111996, 23081996, 30111996, 12081996, 23091996, 30101996};
        sortDate(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    public static void sortDate(int[] dates) {
        int date_exp = (int)Math.pow(10, 6);
        
        countSort(dates,1,31,date_exp);
        

        int month
    }

    public static void countSort(int[] dates,int min,int max,int exp){
        int[] farr = new int[max-min+1];
        for(int i=0;i<dates.length;i++){
            farr[dates[i]/exp-min]++;
        }

        farr[0]--;
        for(int i=1;i<farr.length;i++){
            farr[i] += farr[i-1];
        }

        int[] ans = new int[dates.length];
        for(int i=dates.length-1;i>=0;i--){
            int pos = farr[dates[i]/exp];
            ans[pos] = dates[i];
            farr[dates[i]/exp]--;
        }
        for(int i=0;i<ans.length;i++){
            dates[i] = ans[i];
        }
    }
}
