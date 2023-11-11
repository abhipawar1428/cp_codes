class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(letters[mid]==target){
                break;
            }
            else if(letters[mid]<target){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        System.out.println(mid);
        for(int i=mid;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
        
        

    }
}