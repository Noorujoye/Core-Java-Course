package DSA.Tree.Traversal.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    private void recursivePostOrder(TreeNode root , List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        recursivePostOrder(root.left , arr);
        recursivePostOrder(root.right , arr);

    }
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        recursivePostOrder(root , arr);
        return arr;
    }
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

        Preorder preorder = new Preorder();
        List<Integer> traversed = preorder.preOrder(root);

        for (int i=0; i<traversed.size(); i++) {
            if (i < traversed.size()-1) {
                System.out.print(traversed.get(i) + "->");
            } else {
                System.out.print(traversed.get(i));
            }
        }

    }
}
