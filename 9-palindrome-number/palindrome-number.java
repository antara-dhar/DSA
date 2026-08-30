class Solution {
    public boolean isPalindrome(int x) {
        String st= String.valueOf(x);
        String str=st;
        char ch[]=st.toCharArray();
        int j=st.length()-1;
        for(int i=0;i<st.length()/2;i++){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            j--;
        }
        String cmp=new String(ch);
        if(cmp.equals(st)){
            return true;
        }
        else{
            return false;
        }
    }
}