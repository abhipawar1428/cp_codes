//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        
        Arrays.sort(arr);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=arr.length-1;i>=arr.length-k;i--){
            ar.add(arr[i]);
        }
        return ar;
        
        
        
        
        
        
        /*
        ArrayList<Integer> al=new ArrayList<>();
        int temp=k;
        boolean flag=true;
        while(flag){
            int j=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                    j=i;
                    
               }
            }
            arr[j]=0;

            al.add(max);
            
            if(k==1){
                flag=false;
            }
            k--;
        }
        //System.out.println(al);
        return al ;
*/    }
}