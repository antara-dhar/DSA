class Solution {
    public int matrixSum(int[][] nums) {
        int m= nums.length;
        int n= nums[0].length;
        int sum=0;
        for(int row=0;row<m;row++){
            Arrays.sort(nums[row]);
        }
        for(int col=n-1;col>=0;col--){
            int max =0;
            for(int row=0;row<m;row++){
                max=Math.max(max,nums[row][col]);
            }
            sum+=max;
        }
        return sum;
    }
}