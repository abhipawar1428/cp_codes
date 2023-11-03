class Solution {
    public String reverseOnlyLetters(String s) {
        char[] cArr=s.toCharArray();

        int start=0;
        int end=s.length()-1;

        while(start<end){
            while(!(s.charAt(start)>='a' && s.charAt(start)<='z') && !(s.charAt(start)>='A' && s.charAt(start)<='Z')){
                start++;
                if(start==s.length()){
                    break;
                }
            }
            while(!(s.charAt(end)>='a' && s.charAt(end)<='z') && !(s.charAt(end)>='A' && s.charAt(end)<='Z')){
                end--;
                if(end==-1){
                    break;
                }
            }
            if(start>=end){
                break;
            }
            char temp=cArr[start];
            cArr[start]=cArr[end];
            cArr[end]=temp;

            start++;
            end--;
        }
        return new String(cArr);
    }
}