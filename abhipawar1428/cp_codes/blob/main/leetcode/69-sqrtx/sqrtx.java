class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        else{
            long i=1;
            while(i<=x){
                if(i*i>x){
                    return (int)i-1;
                }else
                    i++;

            }
            return 1;
        } 
    }
}