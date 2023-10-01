class Solution {
    public char findTheDifference(String s, String t) {
        TreeMap<Character,Integer> fmap1=new TreeMap<>();
        for(char ch:s.toCharArray()){
            fmap1.put(ch,fmap1.getOrDefault(ch,0)+1);
        } 
        TreeMap<Character,Integer> fmap2=new TreeMap<>();
        for(char ch:t.toCharArray()){
            fmap2.put(ch,fmap2.getOrDefault(ch,0)+1);
        } 
        for(Map.Entry<Character,Integer> entry:fmap2.entrySet()){
            char ch=entry.getKey();
            if(!fmap1.containsKey(ch) || fmap1.get(ch)!=fmap2.get(ch) ){
                return ch;
            }
        }
        return 'a';
        
    }
}