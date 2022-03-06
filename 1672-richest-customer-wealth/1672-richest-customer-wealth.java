class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=Integer.MIN_VALUE;
        
        for(int i=0;i<accounts.length;i++){
            int sum=0;
         for(int j=0;j<accounts[0].length;j++){
             sum=sum+accounts[i][j];
         }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }
}