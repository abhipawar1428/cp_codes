//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=M;i<=N;i++){
            /*if(isPrime(i)){
                al.add(i);
            }*/
            if(i==0 || i==1 || (i%2==0 && i!=2)){
                continue;
            }
            int flag=0;
            for(int j=3;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                al.add(i);
            }
        }
        return al;
    }
    /*boolean isPrime(int i){
        if(i==0 || i==1 || (i%2==0 && i!=2)){
            return false;
        }
        if(i==2){
            return true;
        }
        for(int j=3;j<=Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    */
}