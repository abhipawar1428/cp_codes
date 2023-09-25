//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(int N) 
    { 
        // code here
        
        Set<Integer> arr=new HashSet<>();
        if(N%2==0){
            arr.add(2);
            N=N/2;
        }
        while(N!=0){
            for(int i=2;i<=N;i++){
                if(N%i==0){
                    arr.add(i);
                    N=N/i;
                    break;
                }
            }
            if(N==1){
                break;
            }
        }
        
        int pro=1;
        for(int num:arr){
            pro=pro*num;
        }
                
        return pro;
    }
}