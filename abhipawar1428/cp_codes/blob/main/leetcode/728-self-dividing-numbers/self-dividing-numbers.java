class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList al=new ArrayList<>();
        int num=left;
        int flag=0;
        for(int i=left;i<=right;i++){
            num=i;
            flag=0;
            while(num!=0){
                int r=num%10;
                if(r==0 || i%r != 0){
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