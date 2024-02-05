class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> countMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            countMap.put(s.charAt(i),countMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(countMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}