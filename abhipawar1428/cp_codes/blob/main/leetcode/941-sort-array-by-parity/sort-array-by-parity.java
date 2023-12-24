class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int optr=0;
        int eptr=0;
        while(nums[eptr]%2!=0){
            eptr++;
            if(eptr==nums.length){
                return nums;
            }
        }
        while(eptr!=nums.length && optr!=nums.length){
            int temp=nums[optr];
            nums[optr]=nums[eptr];
            nums[eptr]=temp;
            optr++;
            eptr++;
            if(eptr==nums.length || optr==nums.length){
                return nums;
            }
            while(nums[eptr]%2!=0){
                eptr++;
               if(eptr==nums.length){
                    return nums;
                }
            }
        }
        return nums;
    }
}