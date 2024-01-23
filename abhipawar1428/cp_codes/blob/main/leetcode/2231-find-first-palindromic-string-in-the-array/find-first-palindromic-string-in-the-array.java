class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int l=0;
            int r=words[i].length()-1;
            int flag=0;
            while(l<r){
                if(words[i].charAt(l)!=words[i].charAt(r)){
                    flag=1;
                    break;
                }
                l++;
                r--;
            }
            if(flag==0){
                return words[i];
            }
        }
        return "";
    }
}