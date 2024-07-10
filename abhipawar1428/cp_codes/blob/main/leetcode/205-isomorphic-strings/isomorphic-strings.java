class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hm=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))!=t.charAt(i)){
                    System.out.print("s");
                    return false;
                }
            }else{
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;

        
    }
}