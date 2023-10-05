//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];       //prefix sum
            //System.out.println(nums[i]);
            //1 2 3  1  2
            //1 3 6  7  9
        }
        for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            if(i==0){
                leftsum=0;
            }else{
                leftsum=arr[i-1];
            }

            if(i==n-1){
                rightsum=0;
            }else{
                rightsum=arr[n-1]-arr[i];
            }

            if(leftsum==rightsum){
                return "YES";
            }
        }    
        return "NO";
    }
}