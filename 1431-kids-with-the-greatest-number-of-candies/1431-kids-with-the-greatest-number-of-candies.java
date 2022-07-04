class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int maxElement = candies[0];
        for(int i=1; i<candies.length; i++){
            if(maxElement < candies[i]){
                maxElement = candies[i];
            }
        }
        
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies < maxElement){
                ans.add(false);
            }
            else ans.add(true);
        }
        return ans;
    }
}