class Solution {
    public boolean isPalindrome(int x) {
        String st=String.valueOf(x);
        String rev = new StringBuilder(st).reverse().toString();
        return rev.equals(st);
    }
}