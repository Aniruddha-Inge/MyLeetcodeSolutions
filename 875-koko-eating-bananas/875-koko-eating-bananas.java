class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        int s=0, e=piles[piles.length-1];
        while (s<e){
            int mid= s + (e-s)/2, cnt=0;
            for (int p: piles) 
                cnt+=Math.ceil((double)p/mid);
            if (cnt>H) s=mid+1;
            else e=mid;
        }
        return s;
    }
}