class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count=0;
        int temp=n;
        while(n!=0){
            count++;
            n/=10;
        }
        n=temp;
            while(n!=0){
                if(count%2==0){
                    sum-=n%10;
                    n/=10;
                    count--;
                }else{
                    sum+=n%10;
                    n/=10;
                    count--;
                }
            }
            return sum;
        
        
    }
}