class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String num=Integer.toString(n);
        for(int i=0;i<num.length();i+=2){
            sum+=num.charAt(i)-'0';
        }
        for(int i=1;i<num.length();i+=2){
            sum-=num.charAt(i)-'0';
        }
        return sum;
    }
}