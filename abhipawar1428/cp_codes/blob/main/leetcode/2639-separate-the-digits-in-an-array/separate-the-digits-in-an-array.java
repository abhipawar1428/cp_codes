class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList al=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                al.add(0);
                continue;
            }
            while(nums[i]!=0){
                al.add(nums[i]%10);
                nums[i]/=10;
            }
        }
        int[] ret=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ret[i]=(int)al.get(al.size()-i-1);
        }
        return ret;
    }
}