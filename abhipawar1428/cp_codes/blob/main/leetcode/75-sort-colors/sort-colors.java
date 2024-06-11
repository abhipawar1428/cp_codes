class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }else if(nums[i]==1){
                o++;
            }else{
                t++;
            }
        }
        

        for(int i=0;i<nums.length;i++){
            if(i<z){
                nums[i]=0;
            }else if(i<(o+z)){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }

    }
}