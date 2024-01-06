class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        return true;
        else if(n<1)
        return false;
        else
        return n%2==0 && isPowerOfTwo(n/2);
    }
}