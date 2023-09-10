class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'  && s.charAt(i)<='9'){
                arr.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        Collections.sort(arr);

        for(int i=arr.size()-1;i>=1;i--){
            if(arr.get(i)!=arr.get(i-1)){
                return arr.get(i-1);
            }

        }
        return -1;
    }
}