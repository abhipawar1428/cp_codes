class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuffer sb=new StringBuffer(s);
        for(int i=1;i<=s.length();i++){
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(sb.toString().equals(goal)){
                return true;
            }

        }
        return false;
    }
}