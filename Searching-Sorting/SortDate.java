public class SortDate {
    public static void main(String[] args) {
        // Date is in ddmmyyyy format 
        int[] dates = {12041996, 20101996, 5061997, 12041989, 11081987};
        sortDate(dates);
        for (int num : dates) {
            System.out.print(num + " ");
        }
    }
    
    public static void sortDate(int[] dates) {
        int date_exp = (int)Math.pow(10, 6);
        
        countSort(dates,1,31,date_exp,'d');
        

        int month_exp = (int) Math.pow(10,4);

        countSort(dates, 1, 12, month_exp,'m');

        int year_exp = (int) Math.pow(10,0);
        
        countSort(dates, 0, 2500, year_exp,'y');
     }

    public static void countSort(int[] dates,int min,int max,int exp,char dmy){
        int div = 100;
        if(dmy=='y') div = (int)Math.pow(10, 4);
        int[] farr = new int[max-min+1];
        for(int i=0;i<dates.length;i++){
            farr[dates[i]/exp%div-min]++;
        }

        farr[0]--;
        for(int i=1;i<farr.length;i++){
            farr[i] += farr[i-1];
        }

        int[] ans = new int[dates.length];
        for(int i=dates.length-1;i>=0;i--){
            int pos = farr[dates[i]/exp%div-min];
            ans[pos] = dates[i];
            farr[dates[i]/exp%div-min]--;
        }
        for(int i=0;i<ans.length;i++){
            dates[i] = ans[i];
        }
    }
}
