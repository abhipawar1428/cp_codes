//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String S) 
    {
        // code here
        int temp=0;
        StringBuffer sb=new StringBuffer();
        int count=1;
        if(S.length()==1){
            sb.append(1);
            sb.append(S.charAt(0));
        }
        while(temp!=S.length()-1){
            if(S.charAt(temp)==S.charAt(temp+1) || S.charAt(temp)==(char)(S.charAt(temp+1)-32) || S.charAt(temp)==(char)(S.charAt(temp+1)+32) ){
                count++;
                if(temp==S.length()-2){
                    sb.append(count);
                    if(S.charAt(temp)>='a' && S.charAt(temp)<='z')
                        sb.append(S.charAt(temp));
                    else
                        sb.append((char)(S.charAt(temp)+32));
                }
            }else{
                sb.append(count);
                if(S.charAt(temp)>='a' && S.charAt(temp)<='z')
                        sb.append(S.charAt(temp));
                else
                        sb.append((char)(S.charAt(temp)+32));
                count=1;
                if(temp==S.length()-2){
                    sb.append(count);
                    if(S.charAt(temp+1)>='a' && S.charAt(temp+1)<='z')
                        sb.append(S.charAt(temp+1));
                    else
                        sb.append((char)(S.charAt(temp+1)+32));
                }
            }
            temp++;
            //System.out.print("A");
        }
        String str=sb.toString();
        return str;
    }
} 