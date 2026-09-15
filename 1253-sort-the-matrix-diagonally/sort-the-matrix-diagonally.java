class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        //for row starting with 0
        for(int col=0;col<n;col++){
            sort(mat,0,col);
        }
        //for col starting with 0
        for(int row=1;row<m;row++){
            sort(mat,row,0);
        }
        return mat;
    }
    public static void sort(int mat[][],int row,int col){
        ArrayList<Integer> list = new ArrayList<>();
        int i=row;
        int j=col;
        while(i<mat.length && j<mat[0].length){
            list.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        i=row;
        j=col;
        for(int x:list){
            mat[i][j]=x;
            i++;
            j++;
        }
    }
}
