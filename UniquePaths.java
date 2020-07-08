class Solution {
    public int uniquePaths(int m, int n) {
        int[][] out= new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j=0 ; j < n ; j++){
                if(i==0 || j==0 ){
                    out[i][j]=1;
                }else{
                    out[i][j] = out[i-1][j]+out[i][j-1];
                }
            }
        }
        return out[m-1][n-1];
    }
}
