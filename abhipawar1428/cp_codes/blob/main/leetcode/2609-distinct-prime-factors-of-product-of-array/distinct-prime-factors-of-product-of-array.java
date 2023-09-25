class Solution {
    public int distinctPrimeFactors(int[] nums) {
        long pro=1;
        HashSet<Integer> unique=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            while(nums[j]!=0){
                for(int i=2;i<=nums[j];i++){
                    if(nums[j]%i==0){
                        unique.add(i);
                        nums[j]=nums[j]/i;
                        break;
                    }
                }
                if(nums[j]==1){
                    break;
                }
            }
        }
        return unique.size();
        
        

    }
}