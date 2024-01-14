class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum=currentSum+nums[i];
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;

    }
}