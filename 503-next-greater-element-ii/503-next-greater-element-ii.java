class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] nge = new int[nums.length];
        
        int n = nums.length;
        
        for(int i=2*n-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty() == false)
                    nge[i] = s.peek();
                else
                    nge[i] = -1;
            }
            s.push(nums[i%n]);
        }
        return nge;
    }
}