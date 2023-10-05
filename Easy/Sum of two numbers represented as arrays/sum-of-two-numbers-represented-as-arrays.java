//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        int al=a.length-1;
        int bl=b.length-1;
        int carry=0;
        int aNum=0,bNum=0;
    ArrayList<Integer> retAl=new ArrayList<>();
        while(al>-1 || bl>-1){
            if(al<0){
                aNum=0;
            }else
                aNum=a[al];
            al--;
            if(bl<0){
                bNum=0;
            }else
                bNum=b[bl];
            bl--;
            
            int sum=aNum+bNum+carry;
            retAl.add(sum%10);
            carry=sum/10;
        }
        if(carry!=0){
            retAl.add(carry);
        }
        Collections.reverse(retAl);
        return retAl;
    }
}
