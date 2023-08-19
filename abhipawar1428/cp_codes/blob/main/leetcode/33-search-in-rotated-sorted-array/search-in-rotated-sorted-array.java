class Solution {
    public int search(int[] nums, int target) {
        if(target<nums[0] && target>nums[nums.length-1])
            return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
                
        }
        return -1;
    }
}