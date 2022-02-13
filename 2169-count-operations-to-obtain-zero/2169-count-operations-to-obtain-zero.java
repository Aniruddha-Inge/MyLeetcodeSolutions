class Solution {
    public int countOperations(int num1, int num2) {
        if(num1==0||num2==0) {
            return 0;
        }
        int op =1;
        while(Math.abs(num1-num2)>0 ) {
            op++;
            if(num1>num2) {
                num1=num1-num2;
            } else {
                num2=num2-num1;
            }
        }
        return op;
    }
}