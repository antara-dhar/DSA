class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i= 0;i<s.length();i++){
            char a=s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char b=t.charAt(i);
            if(!map.containsKey(b)){
                return false;
            }
            map.put(b,map.get(b)-1);
            if(map.get(b)==0){
                map.remove(b);
            }
        }
        return true;
    }
}