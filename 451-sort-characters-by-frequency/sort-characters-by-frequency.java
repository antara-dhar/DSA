class Solution {
    public String frequencySort(String s) {
        //count frequency of each character
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //store unique characters
        List<Character> chars= new ArrayList<>(map.keySet());
        //sort acc to frequency
        Collections.sort(chars, (a,b)->map.get(b)-map.get(a));
        StringBuilder ans=new StringBuilder();
        for(char ch:chars){
            int freq=map.get(ch);
            while(freq>0){
                ans.append(ch);
                freq--;
            }
        }
        return ans.toString();

    }
}