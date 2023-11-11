class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int cmin=0,cmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                cmax++;
            }else if(nums[i]==min){
                cmin++;
            }
        }
        return nums.length-cmax-cmin;
    }
}