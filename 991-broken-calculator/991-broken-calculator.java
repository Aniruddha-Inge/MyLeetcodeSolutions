class Solution {
public int brokenCalc(int start, int target) {
		// hold no of operations
		int ans = 0;
		// till target is greater then start
		while (start < target) {
			// if target is odd. make it even as we can then perform divide operation. which
			// indeed make no of operation min
			if (target % 2 == 1) {
				target++;
			} else {
				// if target is even. divide by 2.
				target = target / 2;
			}
			// increment operation
			ans++;
		}
		// either start reaches target. in such case return ans. else then add 1 start -
		// target no of times more to the target to make it equal to start.
		return ans + start - target;
	}
}