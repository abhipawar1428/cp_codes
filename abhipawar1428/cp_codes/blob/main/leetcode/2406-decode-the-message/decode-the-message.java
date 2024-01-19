class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char ch='a';
        for(char c:key.toCharArray()){
            if(c==' '){
                continue;
            }
            if(!map.containsKey(c)){
                map.put(c,ch++);
            }
        }
        StringBuffer sb=new StringBuffer();
        for(char c:message.toCharArray()){
            if(c==' '){
                sb.append(' ');
            }else{
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }
}