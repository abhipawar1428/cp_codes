class Solution {
    public String addStrings(String num1, String num2) {
        int ptr1=num1.length()-1;
        int ptr2=num2.length()-1;
        
        int carry=0;
        StringBuffer sb=new StringBuffer();
        while(ptr1!=-1 && ptr2!=-1){
            int num=(num1.charAt(ptr1)-'0') + (num2.charAt(ptr2)-'0')+carry;
            System.out.println(num);
            
            if(num < 10){
                carry=0;
                sb.insert(0,num);
            }else{
                sb.insert(0,num % 10);
                carry=1;
            }
            ptr1--;
            ptr2--;
        }
        while(ptr1!=-1){
            int num=(num1.charAt(ptr1)-'0')+ carry;
            if(num>9){
                carry=1;
                sb.insert(0,num%10);
            }else{
                carry=0;
                sb.insert(0,num);
            }
            ptr1--;
        }
        while(ptr2!=-1){
            int num=(num2.charAt(ptr2)-'0')+ carry;
            if(num>9){
                carry=1;
                sb.insert(0,num%10);
            }else{
                carry=0;
                sb.insert(0,num);
            }
            ptr2--;
        }
        if(carry==1)
            sb.insert(0,carry);
        return sb.toString();
    }
}