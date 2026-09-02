class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char chr[]=str.toCharArray();
            Arrays.sort(chr);
            String ans= new String(chr);
            map.putIfAbsent(ans,new ArrayList<>());
            map.get(ans).add(str);
        }
        return new ArrayList<>(map.values());
    }
}