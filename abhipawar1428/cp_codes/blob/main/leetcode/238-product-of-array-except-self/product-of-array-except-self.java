class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            nums[i]=nums[i+1]*nums[i];
        }
        nums[0]=nums[1];
        for(int i=1;i<nums.length-1;i++){
            nums[i]=pre[i-1]*nums[i+1];
        }
        nums[nums.length-1]=pre[nums.length-2];
        return nums;

    }
}