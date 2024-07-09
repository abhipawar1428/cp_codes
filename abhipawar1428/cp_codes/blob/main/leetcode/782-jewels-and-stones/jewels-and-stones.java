class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> s=new HashMap<>();
        for(char c:stones.toCharArray()){
            s.put(c,s.getOrDefault(c,0)+1);
        }
        for(char j:jewels.toCharArray()){
            if(s.containsKey(j)){
                int jCount=s.get(j);
                count+=jCount;
            }
        }
        return count;
    }
}