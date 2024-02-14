class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> negative=new LinkedList<>();
        Queue<Integer> positive=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                negative.offer(nums[i]);
            else
                positive.offer(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i++]=positive.poll();
            nums[i]=negative.poll();
        }
        return nums;
    }
}