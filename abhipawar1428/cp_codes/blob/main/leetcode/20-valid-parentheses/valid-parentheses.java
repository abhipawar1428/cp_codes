class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }else if(s.length()==0){
            return true;
        }else{
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{'){
                    stack.push(ch);
                }else{
                    if(stack.empty()){
                       return false; 
                    }else{
                        char ch2=stack.peek();
                        if((ch==')' && ch2=='(') || (ch==']' && ch2=='[') || (ch=='}' && ch2=='{')){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }
                }
            }
            if(stack.empty())
                return true;
            else
                return false;
        }
    }
}