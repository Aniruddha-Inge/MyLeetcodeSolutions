class Solution {
    public int minPartitions(String n) {
        int maxInt = 0;
        for(int i=0; i<n.length(); i++){
            maxInt = Math.max(maxInt, n.charAt(i) - '0');
        }
        return maxInt;
    }
}