//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        TreeMap<Character,Integer> freqmap=new TreeMap<>();
        for(char ch:line.toCharArray()){
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ch1='\0';
        for(Map.Entry<Character,Integer> entry:freqmap.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ch1=entry.getKey();
            }
        }
        return ch1;
    }
    
}