class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String num2=Integer.toString(k);
        int ptr1=num.length-1;
        int ptr2=num2.length()-1;

        List<Integer> ret=new LinkedList<>();
        int carry=0;
        while(ptr1!=-1 && ptr2!=-1){
            int sum=num[ptr1]+(num2.charAt(ptr2)-'0') + carry;

            if(sum<10){
                carry=0;
                ret.addFirst(sum);
            }else{
                carry=1;
                ret.addFirst(sum%10);
            }
            ptr1--;
            ptr2--;
        }
        while(ptr1!=-1){
            int sum=num[ptr1--]+carry;
            if(sum<10){
                carry=0;
                ret.addFirst(sum);
            }else{
                carry=1;
                ret.addFirst(sum%10);
            }
        }
        while(ptr2!=-1){
            int sum=num2.charAt(ptr2--)-'0'+carry;
            if(sum<10){
                carry=0;
                ret.addFirst(sum);
            }else{
                carry=1;
                ret.addFirst(sum%10);
            }
        }
        if(carry==1){
            ret.addFirst(1);
        }
        return ret;
    }
}