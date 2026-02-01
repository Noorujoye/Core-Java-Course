package DSA.Tree.Traversal.Iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Postorder {

    // ---------- Tree Node ----------
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // ---------- Recursive Postorder ----------
    private void recursive(TreeNode root, List<Integer> list) {
        if (root == null) return;
        recursive(root.left, list);
        recursive(root.right, list);
        list.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursive(root, list);
        return list;
    }

    // ---------- Two Stack Postorder ----------
    public List<Integer> twoStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {
            TreeNode node = st1.pop();
            st2.push(node);

            if (node.left != null) st1.push(node.left);
            if (node.right != null) st1.push(node.right);
        }

        while (!st2.isEmpty()) {
            res.add(st2.pop().val);
        }

        return res;
    }

    // ---------- One Stack Postorder (Interview Gold) ----------
    public List<Integer> oneStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = st.peek();

                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    res.add(peek.val);
                    lastVisited = st.pop();
                }
            }
        }
        return res;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        Postorder postorder = new Postorder();

        System.out.println("Recursive  : " + postorder.postorderTraversal(root));
        System.out.println("Two Stack  : " + postorder.twoStack(root));
        System.out.println("One Stack  : " + postorder.oneStack(root));
    }
}
