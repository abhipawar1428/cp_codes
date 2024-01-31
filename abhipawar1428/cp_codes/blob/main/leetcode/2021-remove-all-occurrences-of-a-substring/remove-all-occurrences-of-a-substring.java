class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            sb.delete(sb.indexOf(part),sb.indexOf(part)+part.length());
            System.out.println(sb);
        }
        return sb.toString();
        
    }
}