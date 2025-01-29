//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static class Student implements Comparable<Student> {
        int p;
        int c;
        int m;
        Student(int p,int c,int m){
            this.p = p;
            this.c = c;
            this.m = m;
        }
        public int compareTo(Student o){
            if(this.p != o.p){
                return this.p - o.p;
            }
            else if(this.c != o.c){
                return o.c - this.c;
            }
            else{
                return this.m - o.m;
            }
        }
    }
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        // your code here
        Student[] students = new Student[N];
        for(int i=0;i<N;i++){
            students[i] = new Student(phy[i],chem[i],math[i]);    
        }
        Arrays.sort(students);
        for(int i=0;i<N;i++){
            phy[i] = students[i].p;
            chem[i] = students[i].c;
            math[i] = students[i].m;
        }
    }
}
