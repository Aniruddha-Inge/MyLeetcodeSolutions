class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        
        int n = heights.length;
        int[] rb = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        rb[n-1] = n;
        
        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size() == 0) rb[i] = n;
            else rb[i] = st.peek();
            
            st.push(i);
        }
        
        int[] lb = new int[n];
        Stack<Integer> st2 = new Stack<>();
        st2.push(0);
        lb[0] = -1;
        
        for(int i=0; i<n; i++){
            while(st2.size()>0 && heights[i] <= heights[st2.peek()]){
                st2.pop();
            }
            if(st2.size() == 0) lb[i] = -1;
            else lb[i] = st2.peek();
            
            st2.push(i);
        }
        
        for(int i=0; i<heights.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = heights[i]*width;
            
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    
}