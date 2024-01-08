class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;

        int ptr=s.length()-1;
        while(s.charAt(ptr)!=' '){
            ptr--;
            count++;
            if(ptr<0){
                break;
            }
            
        }
        return count;
    }
}