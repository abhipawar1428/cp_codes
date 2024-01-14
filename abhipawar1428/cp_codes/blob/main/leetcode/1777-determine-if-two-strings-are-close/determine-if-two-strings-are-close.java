class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }else{
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<word1.length();i++){
                map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i),0)+1);
            }
            HashMap<Character,Integer> map2=new HashMap<>();
            for(int i=0;i<word1.length();i++){
                map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
            }
            if(map.size()==map2.size()){
                int a1[]=new int[map.size()];
                int a2[]=new int[map.size()];

                int i=0;
                for(char key:map.keySet()){
                    if(!map2.containsKey(key)){
                        return false;
                    }else{
                        a1[i]=map.get(key);
                        a2[i]=map2.get(key);
                        i++;
                    }
                }
                Arrays.sort(a1);
                Arrays.sort(a2);

                return Arrays.equals(a1,a2);

            }else
                return false;

        }
    }
}