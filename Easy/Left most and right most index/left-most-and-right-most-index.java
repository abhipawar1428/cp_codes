//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int start=0;
        int end=v.length-1;
        int index=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(v[mid]==x){
                index=mid;
                break;
            }else if(v[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        pair p=new pair(-1,-1);
        if(index==0 && v[index]!=x){
            return p;
        }else{
            
            if(index==0){
                p.first=0;
            }else{
                while(true){
                    if(index-1==-1){
                        p.first=0;
                        break;
                    }
                    if(v[index]==v[index-1]){
                        index--;
                    }else{
                        p.first=index;
                        break;
                    }
                }
            }
            if(v[v.length-1]==x){
                p.second=v.length-1;
            }else{
            for(int i=index;i<v.length-1;i++){
                if(v[i]!=v[i+1]){
                    p.second=i;
                    break;
                }
                
            }
            }
            return p;
            
        }
    }
}