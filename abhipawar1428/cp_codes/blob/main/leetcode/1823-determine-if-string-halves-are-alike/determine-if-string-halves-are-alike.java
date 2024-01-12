class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int s1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<s.length()/2){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    s1++;
                }
            }else{
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    s1--;
                }
            }

        }
        if(s1==0)   
            return true;
        else
            return false;
    }
}