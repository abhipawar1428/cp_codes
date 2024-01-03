class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int ptr1=0;
        int ptr2=0;

        while(ptr1!=haystack.length()-needle.length()+1){
            ptr2=0;
            int ptr=ptr1;
            while(ptr2 != needle.length()){
                if(haystack.charAt(ptr)==needle.charAt(ptr2)){
                    ptr++;
                    ptr2++;
                }else{
                    break;
                }
                if(ptr2==needle.length()){
                    return ptr1;
                }
            }
            ptr1++;
        }
        return -1;
    }
}