class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int cnt=0;
        int temp=0;
        for(int i=0;i<n;i++){
             if(s.charAt(i)=='|') temp+=1;
             if(s.charAt(i)=='*' && temp%2==0) cnt+=1;
        }
        return cnt;
    }
}