import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> index = new HashMap<>();

        //construct a hashtable to map each element to its own reference
        for (int i = 0; i < n; i++) {
            index.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int other = target - nums[i];

            //if other exist && is not nums[i] itself
            if (index.containsKey(other) && index.get(other) != i) {
                return new int[] {i, index.get(other)};
            }
        }

        return new int[] {-1, -1};
    }
}

/*
Test results

Runtime: 3 ms, faster than 67.56% of Java online submissions for Two Sum.
Memory Usage: 40.5 MB, less than 35.57% of Java online submissions for Two Sum.
*/
