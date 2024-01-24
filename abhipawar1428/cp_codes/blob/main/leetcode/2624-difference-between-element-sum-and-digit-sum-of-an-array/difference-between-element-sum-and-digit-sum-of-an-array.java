class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digSum=0;
        for(int i=0;i<nums.length;i++){
            eleSum+=nums[i];
            int temp=nums[i];
            int tempSum=0;
            while(temp!=0){
                tempSum=tempSum+temp%10;
                temp/=10;
            }
            digSum+=tempSum;
        }
        return Math.abs(eleSum-digSum);
    }
}