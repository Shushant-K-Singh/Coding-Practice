class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length; // no. rows
        int c = matrix[0].length;  // no. of column
     
        int[] row = new int[r];
        int[] col = new int[c];

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1 ){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
