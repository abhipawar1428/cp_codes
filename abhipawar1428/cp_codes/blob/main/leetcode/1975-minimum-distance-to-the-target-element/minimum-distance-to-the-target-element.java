class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int r=start;
        int l=start;

        int flag1=0;
        while(l!=-1){
            if(nums[l]==target){
                flag1=1;
                break;
            }
            l--;
        }

        int flag2=0;
        while(r!=nums.length){
            if(nums[r]==target){
                flag2=1;
                break;
            }
            r++;
        }
        if(flag1==1 && flag2==1){
            return Math.min((start-l),(r-start));
        }else if(flag1==1){
            return start-l;
        }else{
            return r-start;
        }
    }
}