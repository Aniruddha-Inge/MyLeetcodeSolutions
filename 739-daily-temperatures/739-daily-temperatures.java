class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // span[n-1] = 0;
        // st.push(temperatures[n-1]);
        
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            // if(st.size() == 0){
            //     span[i] = i+1;
            // }
            if(!st.isEmpty()) {
                span[i] = st.peek() - i;
            }
            
            st.push(i);
        }
        return span;
    }
}