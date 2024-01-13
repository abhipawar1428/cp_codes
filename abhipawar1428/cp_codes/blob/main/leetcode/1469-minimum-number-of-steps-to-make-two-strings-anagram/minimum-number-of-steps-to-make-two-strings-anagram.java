class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        int count=0;
        for(char key:map.keySet()){
            int c1=map.get(key);
            int c2=0;
            if(map2.get(key) != null){
                c2=map2.get(key);
                if(c1-c2 >0)
                    count=count+(map.get(key)-map2.get(key));
            }else{
                count=count+(map.get(key)-0);
            }
        }
        return count;

    }
}