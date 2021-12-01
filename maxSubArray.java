class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) {return 0;}
        int[] dp = new int[n];

        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
        }

        int results = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            results = Math.max(results, dp[i]);
        }

        return results;
    }
}

/*
Test results

Runtime: 2 ms, faster than 44.61% of Java online submissions for Maximum Subarray.
Memory Usage: 48.1 MB, less than 95.41% of Java online submissions for Maximum Subarray.
*/
