class Solution {
    public String[] findWords(String[] words) {
        StringBuffer sb=new StringBuffer("qwertyuiop");
        StringBuffer sb2=new StringBuffer("asdfghjkl");
        StringBuffer sb3=new StringBuffer("zxcvbnm");
        List<String> ret=new LinkedList<>();
        for(int i=0;i<words.length;i++){
            boolean result=false;
            String string=words[i].toLowerCase();
            if(sb.indexOf(Character.toString(string.charAt(0))) != -1){
                result=isInRow(sb,words[i].toLowerCase());
            }else if(sb2.indexOf(Character.toString(string.charAt(0))) != -1){
                result=isInRow(sb2,words[i].toLowerCase());
            }else{
                result=isInRow(sb3,words[i].toLowerCase());
            }
            if(result){
                ret.add(words[i]);
            }
        }
        // String retArr[]=new String[ret.size()];
        // for(int i=0;i<retArr.length;i++){
        //     retArr[i]=ret.get(i);
        // }
        return ret.toArray(new String[0]);
        //return retArr;
    }
    boolean isInRow(StringBuffer sb,String str){
        for(int i=1;i<str.length();i++){
            if(sb.indexOf(Character.toString(str.charAt(i)))==-1){
                return false;
            }
        }
        return true;
    }
}