class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }else{
            long l=1;
            long r=x;

            long mid=-1;
            while(l<=r){
                mid=(l+r)/2;
                if(mid*mid==x){
                    return (int)mid;
                }else if(mid*mid>x){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            return (int)r;
        }
    }
}