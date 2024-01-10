class Solution {
    public int addDigits(int num) {
        if(num<=9){
            return num;
        }
        while(num>9){
            int temp=num;
            num=0;
            while(temp!=0){
                num=num+temp%10;
                temp/=10;
            }
        }
        return num;
    }
}