class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n= matrix[0].length;
        int answer[][] = new int[m][n];
        for(int col=0;col<n;col++){
            int max=0;
            for(int row=0;row<m;row++){
                max=Math.max(max,matrix[row][col]);
            }
            for(int row=0;row<m;row++){
                if(matrix[row][col]== -1){
                    answer[row][col] = max;
                }
                else{
                    answer[row][col]=matrix[row][col];
                }
            }
        }
        return answer;
    }
}

//00  01  02
//10  11  12
//20  21  22