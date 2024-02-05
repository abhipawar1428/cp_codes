class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(set.add(i)){
                return i;
            }
        }
        return 0;
    }
}