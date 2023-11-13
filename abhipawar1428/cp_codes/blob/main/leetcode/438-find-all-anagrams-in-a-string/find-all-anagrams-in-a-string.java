class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> al=new ArrayList<>();
        
        char[] crp=new char[p.length()];
        for(int k=0;k<crp.length;k++){
            crp[k]=p.charAt(k);
        }
        Arrays.sort(crp);

        for(int i=0;i<s.length()-p.length()+1;i++){
            char[] crs=new char[p.length()];
            for(int j=0;j<crs.length;j++){
                crs[j]=s.charAt(i+j);
            }
            Arrays.sort(crs);
            // System.out.println(crs);
            // System.out.println(crp);
            boolean isEqual=Arrays.equals(crp, crs);
            if(isEqual){
                al.add(i);
            }
            

        }
        return al;
    }
}