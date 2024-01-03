//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.reverseAlternate(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String reverseAlternate(String s) 
    {
        // code here
        String[] arr=s.split(" ");
        StringBuffer sb=new StringBuffer();
        int i=0;
        for(String str:arr){
            if(i%2==0){
                sb.append(str);
                sb.append(" ");
                
            }else{
                StringBuffer sb1=new StringBuffer(str);
                sb1=sb1.reverse();
                sb.append(sb1);
                sb.append(" ");
            }
            i++;
        }
        String ret=sb.toString();
        return ret;
    }
} 