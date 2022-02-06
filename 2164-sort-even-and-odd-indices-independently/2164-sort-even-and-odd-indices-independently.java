class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n < 3) return nums; // base case
        
        // initialize two arraylists to store nums
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if( (i & 1) == 1)  // even
                even.add(nums[i]);
            else  // odd
                odd.add(nums[i]);
        }
        
        // sort 
        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());
        
        // store into one array
        int[] ans = new int[n];
        int x = 0, y = 0;
        for(int i = 0; i < n; i++) {
            if((i & 1) == 1) {
                ans[i] = even.get(x++); 
            } else {
                ans[i] = odd.get(y++); 
            }
        }
        return ans;
    }
}