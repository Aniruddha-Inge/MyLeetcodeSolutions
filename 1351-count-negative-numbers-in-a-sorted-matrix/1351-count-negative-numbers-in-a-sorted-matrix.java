class Solution {
    public int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length-1;
        int m = grid.length;
        int ans = 0;
        
        while(row<m && col>=0){
            if(grid[row][col]<0){
                ans+=m-row;
                col--;
            }else{
                row++;
            }
        }
        return ans;
        
    }
}