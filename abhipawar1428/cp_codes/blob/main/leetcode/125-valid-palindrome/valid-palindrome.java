class Solution {
    public boolean isPalindrome(String s) {
    
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }
        }
        int start=0;
        int end=sb.length()-1;
        
        String str=sb.toString();
        str=str.toLowerCase();
        System.out.println(str);
        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}