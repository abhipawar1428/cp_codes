class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList al=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int flag=0;
            while(num!=0){
                if(num%10==0){
                    flag=1;
                    break;
                }
                if(i%(num%10) != 0){
                    flag=1;
                    break;
                }
                num/=10;
            }
            if(flag==0){
                al.add(i);
            }
        }
        return al;
    }
}