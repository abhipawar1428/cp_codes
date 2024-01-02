class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
        int slow=0;
        int fast=0;
        int count=1;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                fast++;
                count++;
                if(count<3){
                    nums[++slow]=nums[fast];
                }
            }else{
                count=1;
                nums[++slow]=nums[++fast];
            }

        }
        return slow+1;
    }
}