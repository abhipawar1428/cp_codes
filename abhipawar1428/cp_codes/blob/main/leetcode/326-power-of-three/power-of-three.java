class Solution {
    public boolean isPowerOfThree(int n) {
        int pow=0;
        while(Math.pow(3,pow)<=n){
            if(Math.pow(3,pow)==n){
                return true;
            }
            pow++;
        }
        return false;
    }
}