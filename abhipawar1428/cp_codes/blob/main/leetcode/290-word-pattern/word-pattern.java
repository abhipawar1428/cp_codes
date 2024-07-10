class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        String[] sArr=s.split(" ");
        int i=0;
        if(pattern.length()!=sArr.length){
            return false;
        }
        for(char ch:pattern.toCharArray()){
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(sArr[i])){
                    return false;
                }
            }else{
                if(map.containsValue(sArr[i])){
                    return false;
                }
                map.put(ch,sArr[i]);
            }
            i++;
            
        }
        
        return true;
    }
}