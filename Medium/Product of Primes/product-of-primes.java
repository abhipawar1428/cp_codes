//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(long L, long R){
        // code here
        long pro=1;
        long mod=(long)Math.pow(10,9)+7;

        for(long i=L;i<=R;i++){
            int count=0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                }
                if(count>1){
                    break;
                }
            }
            if(count==1){
                pro=(pro*i)%mod;
            }
            count=0;
        }
        return pro;
    }
}