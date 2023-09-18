//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> v;
		    v = obj.countFreq(arr,n);
            for(int i : v)
                System.out.print(i+" ");
		    System.out.println();
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public ArrayList<Integer> countFreq(int[] a, int n)  
    { 
  
        // complete the function
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        ArrayList<Integer> retArr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(retArr.size()==0){
                retArr.add(entry.getValue());
            }else{
                retArr.add(entry.getValue()+retArr.get(retArr.size()-1));
            }
        }
        return retArr;
        
    }  
      
}

