class Solution {
    public boolean checkIfExist(int[] arr) {
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j]){
                    return true;
                }else if(arr[i]*2==arr[j]){
                    return true;
                }    
            }
        }
        return false;
        */
        HashSet<Integer> hSet=new HashSet<>();
        for(int num:arr){
            if(hSet.contains(num*2) || (num%2==0 && hSet.contains(num/2))){
                return true;
            }
            
            hSet.add(num);
        }
        
        return false;

    }
}