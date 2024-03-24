class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hset.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}