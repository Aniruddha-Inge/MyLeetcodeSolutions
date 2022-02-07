class Solution {
    public long smallestNumber(long num) {
        long val = num;
        if (val < 0)
            val = 0 - val;
        String s = val + "";
        int n = s.length();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.charAt(i) - '0';
        
        Arrays.sort(arr);
        long res = 0;
        if (num < 0) {
            for (int i = n - 1; i >= 0; i--)
                res = res * 10 + arr[i];
            return 0 - res;
        } else {
            //swap arr[i] with first zero
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = temp;
                    break;
                }
            }
            
            for (int i = 0; i < n; i++)
                res = res * 10 + arr[i];
            return res;
        }
    }
}