class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' ||
               s.charAt(i)=='e' || s.charAt(i)=='E' ||
               s.charAt(i)=='i' || s.charAt(i)=='I' ||
               s.charAt(i)=='o' || s.charAt(i)=='O' ||
               s.charAt(i)=='u' || s.charAt(i)=='U' ){
                   al.add(s.charAt(i));
               }
        }
        Collections.sort(al);
        StringBuffer sb=new StringBuffer("");
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' ||
               s.charAt(i)=='e' || s.charAt(i)=='E' ||
               s.charAt(i)=='i' || s.charAt(i)=='I' ||
               s.charAt(i)=='o' || s.charAt(i)=='O' ||
               s.charAt(i)=='u' || s.charAt(i)=='U' ){
                   sb.append(al.get(j));
                   j++;
                   if(j==al.size()){
                       sb.append(s.substring(i+1));
                       break;
                   }
               }else{
                   sb.append(s.charAt(i));
               }
        }
        return sb.toString();
    }
}