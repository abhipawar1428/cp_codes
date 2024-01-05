class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        while(n!=0){
            int r=n%10;
            sum=sum+(r*r);
            n=n/10;

            if(n==0){
                if(sum==1){
                    return true;
                }else{
                    n=sum;
                    sum=0;
                    if(!hs.add(n)){
                        return false;
                    }else{
                        hs.add(n);
                    }

                }
            }
        }
        return true;
    }
}