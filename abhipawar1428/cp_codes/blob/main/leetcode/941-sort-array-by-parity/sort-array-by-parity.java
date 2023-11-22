class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int r=0;
        int l=0;
        while(r<nums.length){
            if(nums[r]%2==0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }else{
                r++;
            }
        }
        return nums;
    }
}