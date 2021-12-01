class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //move elements of nums1 to the end
        for (int count = 1; count <= m; count++) {
            nums1[m + n - count] = nums1[m - count];
        }
        int i = n; //i 从 n 开始
        int j = 0;
        int k = 0;
        while (j < n) {
            //if nums1 was traversed to its end, add all remaining elements of nums2
            if (i == m + n) {
                while (j < n) {
                    nums1[k++] = nums2[j++];
                }
                return;
            }
            //add the smaller element
            if (nums2[j] < nums1[i]) {
                nums1[k] = nums2[j++];
            } else {
                nums1[k] = nums1[i++];
            }
            k++;
        }
    }
}

/*
Test results

Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
Memory Usage: 38.7 MB, less than 99.27% of Java online submissions for Merge Sorted Array.
*/
