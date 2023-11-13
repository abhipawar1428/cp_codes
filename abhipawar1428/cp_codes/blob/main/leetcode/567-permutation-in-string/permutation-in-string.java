class Solution {
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<Integer> al=new ArrayList<>();
        
        char[] s1c=new char[s1.length()];
        for(int k=0;k<s1c.length;k++){
            s1c[k]=s1.charAt(k);
        }
        Arrays.sort(s1c);

        for(int i=0;i<s2.length()-s1.length()+1;i++){
            char[] s2c=new char[s1c.length];
            for(int j=0;j<s2c.length;j++){
                s2c[j]=s2.charAt(i+j);
            }
            Arrays.sort(s2c);
            // System.out.println(crs);
            // System.out.println(crp);
            boolean isEqual=Arrays.equals(s1c,s2c);
            if(isEqual){
                return true;
            }
            

        }
        return false;
        
    }
}