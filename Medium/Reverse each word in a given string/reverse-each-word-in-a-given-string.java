//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        StringBuffer sb=new StringBuffer();
        String arr[]=S.split("\\.");
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }*/
        
        for(int i=0;i<arr.length;i++){
            StringBuffer sb2=new StringBuffer("");
            for(int j=arr[i].length()-1;j>=0;j--){
                sb2.append(arr[i].charAt(j));
            }
            sb.append(sb2);
            if(i!=arr.length-1){
                sb.append('.');
            }
        }
        int count=0;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)!='.'){
                break;
            }
            if(S.charAt(i)=='.'){
                count++;
            }
        }
        for(int i=1;i<=count;i++)
            sb.append('.');
        String str=sb.toString();
        return str;
        
        
        
    }
}