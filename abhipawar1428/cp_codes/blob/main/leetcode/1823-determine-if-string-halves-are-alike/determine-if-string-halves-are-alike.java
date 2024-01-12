class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        StringBuffer sb=new StringBuffer(s.substring(s.length()/2,s.length()));
        int s1=0;
        int s2=0;

        for(int i=0;i<sb.length();i++){
            char ch=s.charAt(i);
            char ch2=sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                s1++;
            }
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'){
                s2++;
            }
        }
        if(s1==s2){
            return true;
        }else{
            return false;
        }
    }
}