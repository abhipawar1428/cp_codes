class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hSet=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hSet.add(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return '\0';
    }
}