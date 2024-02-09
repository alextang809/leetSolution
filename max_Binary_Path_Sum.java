public class max_Binary_Path_Sum {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        int maxSum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxGain(root);
            return maxSum;
        }

        public int maxGain(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftGain = Math.max(maxGain(node.left), 0);
            int rightGain = Math.max(maxGain(node.right), 0);

            int priceNewpath = node.val + leftGain + rightGain;

            maxSum = Math.max(maxSum, priceNewpath);

            return node.val + Math.max(leftGain, rightGain);
        }
    }

    // write a complex 4-layer binary tree as a process to test the code
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution sol = new Solution();
        System.out.println(sol.maxPathSum(root));
    }



    public static void main(String[] args) {
        max_Binary_Path_Sum sol = new max_Binary_Path_Sum();
        sol.test();
    }
}
