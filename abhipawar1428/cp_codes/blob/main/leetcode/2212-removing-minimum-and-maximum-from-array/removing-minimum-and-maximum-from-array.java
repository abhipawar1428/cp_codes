class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        System.out.println(nums[min]+"  "+nums[max]);
        
        int d1=0;
        int d2=0;
        int d3=0;

        if(min<max){
            d1=max+1;
        }else{
            d1=min+1;
        }

        if(nums.length-max > nums.length-min){
            d2=nums.length-max;
        }else{
            d2=nums.length-min;
        }

        int temp1=0;
        if((nums.length-min) < (min-0)){
            temp1=nums.length-min;
        }else{
            temp1=min+1;
        }
        int temp2=0;
        if((nums.length-max) < (max-0)){
            temp2=nums.length-max;
        }else{
            temp2=max+1;
        }
        d3=temp1+temp2;

        if(d1<d2){
            if(d1<d3){
                return d1;
            }else{
                return d3;
            }
        }else{
            if(d2<d3){
                return d2;
            }else{
                return d3;
            }
        }

    }
}