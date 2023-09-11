//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        ArrayList<Character> retStr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(!retStr.contains(str.charAt(i))){
                retStr.add(str.charAt(i));
            }
        }
        StringBuffer ret=new StringBuffer();
        for(int i=0;i<retStr.size();i++){
            ret=ret.append(retStr.get(i));
        }
        return ret.toString();
    }
}

