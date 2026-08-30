class Solution {
    public boolean isValid(String s) {
        char arr[]=s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch:arr){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top!='(')
                || (ch=='}' && top!='{')||
                (ch==']' && top!='[')){
                    return false;
                }
            }
        
        }
        return stack.isEmpty();
    }
}