class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            map.put(nums[i],1);
            if(map.get(nums[i])==n){
                ls.add(nums[i]);
            }
            if(ls.size()==2)
            break;
        }
        
        return ls;



    }
}