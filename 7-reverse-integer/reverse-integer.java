class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int d=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE && d>7){
                return 0;
            }
            else if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE && d<-8){ 
                return 0;
            }
            rev=rev*10+d;
            x=x/10;
        }
        return rev;
    }
}