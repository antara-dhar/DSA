class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        HashSet<Integer> temp1= new HashSet<>(set1);
        HashSet<Integer> temp2= new HashSet<>(set2);
        temp1.removeAll(set2);
        temp2.removeAll(set1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(temp1));
        ans.add(new ArrayList<>(temp2));
        return ans;
    }
}