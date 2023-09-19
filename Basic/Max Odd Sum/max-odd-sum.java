//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long findMaxOddSubarraySum(long arr[] ,int n)
    {
        long minOdd=Long.MAX_VALUE;
        boolean isOdd=false;
        long sum=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]>0){
                sum=sum+arr[i];
            }
            if(arr[i]%2!=0){
                isOdd=true;
                if(minOdd>Math.abs(arr[i])){
                    minOdd=Math.abs(arr[i]);
                }
            }
        }
        // System.out.println (sum);
        // System.out.println(minOdd);
        if(isOdd==false){
            return -1;
        }
        if(sum%2==0){
            return sum-minOdd;
        }
        return sum;

    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.findMaxOddSubarraySum(a,n);
            System.out.println(ans);
        }
    }
}





// } Driver Code Ends