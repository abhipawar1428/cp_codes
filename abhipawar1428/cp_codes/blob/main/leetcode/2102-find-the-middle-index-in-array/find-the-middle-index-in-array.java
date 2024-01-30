class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int[] pre=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        if(nums[nums.length-1]-nums[0]==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[nums.length-1]-nums[i]){
                return i;
            }
        }
        return -1;
    }
}