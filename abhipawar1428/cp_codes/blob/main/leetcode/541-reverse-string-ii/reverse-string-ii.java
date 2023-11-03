class Solution {
    public String reverseStr(String s, int k) {
        char cArr[]=s.toCharArray();
        int ptr=0;
        if(s.length()==1){
            return s;
        }
        while(ptr<s.length()){
            int start=ptr;
            int end=start+k-1;

            if(end>=s.length()){
                end=s.length()-1;
            }
            while(start<end){
                char temp=cArr[start];
                cArr[start]=cArr[end];
                cArr[end]=temp;
                start++;
                end--;
            }
            ptr+=2*k;

        }
        return new String(cArr);
    }
}