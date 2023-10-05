class Solution {
    public int waysToSplitArray(int[] nums) {
        //prefix sum
        long preSum[]=new long[nums.length];
        preSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            preSum[i]=preSum[i-1]+nums[i];
            //System.out.println(preSum[i]);
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            long leftSum=preSum[i];
            long rightSum=preSum[preSum.length-1]-preSum[i];

            if(leftSum>=rightSum){
                count++;
            }
        }
        return count;

    }
}