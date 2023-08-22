class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            StringBuffer sb2=new StringBuffer();
            for(int j=arr[i].length()-1;j>=0;j--){
                sb2.append(arr[i].charAt(j));
            }
            sb.append(sb2+" ");
        }
        String str=sb.toString();
        return str.trim();

    }
}