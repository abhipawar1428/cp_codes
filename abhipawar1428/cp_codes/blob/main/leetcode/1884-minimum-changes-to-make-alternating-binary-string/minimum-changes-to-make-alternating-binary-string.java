class Solution {
    public int minOperations(String s) {
        StringBuffer sb1=new StringBuffer("");
        StringBuffer sb2=new StringBuffer("");

        for(int i=1;i<=s.length();i++){
            if(i%2==0){
                sb1.append("0");
                sb2.append("1");
            }else{
                sb1.append("1");
                sb2.append("0");
            }
        }
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=sb1.charAt(i)){
                c1++;
            }
            if(s.charAt(i)!=sb2.charAt(i)){
                c2++;
            }
        }
        return Math.min(c1,c2);
    }
}