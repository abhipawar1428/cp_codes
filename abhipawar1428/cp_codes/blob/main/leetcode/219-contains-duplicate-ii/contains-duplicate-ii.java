class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length ;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
                if(Math.abs(i-j)>=k){
                    break;
                }
            }
        }
        return false;
    }
}