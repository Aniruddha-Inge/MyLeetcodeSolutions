class Solution {
    public int maxProfit(int[] prices) {
            int ans=0;
            if(prices.length==0)
            {
                return ans;
            }
            int start=prices[0];                                
            for(int i=1;i<prices.length;i++)
            {
                if(prices[i]>start)
                {
                    if(ans<(prices[i]-start))
                    {
                        ans=prices[i]-start;
                    }
                }
                else
                {
                    start=prices[i];
                }
            }
     return ans;
}
}