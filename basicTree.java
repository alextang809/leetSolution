class TreeNode {
    int val;
    TreeNode[] children;

    // 构造函数，初始化节点
    public TreeNode(int val, TreeNode[] children) {
        this.val = val;
        this.children = children;
    }
}

class TreeTraversal {

    // 遍历函数，现在包含打印语句以显示节点值
    static void traverse(TreeNode root) {
        if (root == null) return; // 防止空指针异常

        // 假设的操作，如打印节点的值
        System.out.println("Visiting node with value: " + root.val);

        for (TreeNode child : root.children) {
            traverse(child);
        }
    }

    public static void main(String[] args) {
        // 构建一个简单的树形结构
        // 例如，一个根节点值为1，它有两个子节点，值分别为2和3
        TreeNode child1 = new TreeNode(2, new TreeNode[] {});
        TreeNode child2 = new TreeNode(3, new TreeNode[] {});
        TreeNode root = new TreeNode(1, new TreeNode[] {child1, child2});

        // 使用traverse函数遍历树
        traverse(root);
    }
}
