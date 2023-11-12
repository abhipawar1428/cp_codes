class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(al.contains(t.charAt(i))){
                al.remove(Character.valueOf(t.charAt(i)));
            }
        }
        //System.out.println(al);
        if(al.size()==0){
            return true;
        }else
            return false;
    }
}