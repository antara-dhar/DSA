class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arrs[]= new int[200];
        int arrt[]= new int[200];
        
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(arrs[s.charAt(i)]!= arrt[t.charAt(i)]){
                return false;
            }
            arrs[s.charAt(i)]=i+1;
            arrt[t.charAt(i)]=i+1;
        }
        return true;
    }
}