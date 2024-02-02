class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ret=new int[2];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ret[0]=nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        sum=sum-ret[0];
        ret[1]=(nums.length*(nums.length+1))/2 - (sum);
        return ret;
    }
}