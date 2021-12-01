class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> index = new HashMap<>();
        boolean findDuplicate = false;
        for (int i = 0; i < n; i++) {
            index.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            if (index.containsKey(nums[i]) && index.get(nums[i]) != i) {
                findDuplicate = true;
            }
        }

        return findDuplicate;
    }
}

/*
Test results

Runtime: 8 ms, faster than 34.04% of Java online submissions for Contains Duplicate.
Memory Usage: 46 MB, less than 40.52% of Java online submissions for Contains Duplicate.
*/
