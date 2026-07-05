package DSA.Tree.Traversal.Recursion;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class InOrder {
    private void recursiveInOrder(TreeNode root , List<Integer> arr) {

        // check root is null or not ?
        if (root == null) {
            return;
        }

        // first traverse left  subtree
        recursiveInOrder(root.left , arr);

        // add data in list
        arr.add(root.data);

        recursiveInOrder(root.right , arr);
    }
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        recursiveInOrder(root , arr);
        return arr;
    }
    public static void main(String[] args) {
        // tree
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

        InOrder inOrder = new InOrder();
        List<Integer> traversed = inOrder.inOrder(root);

        for (int i=0; i<traversed.size(); i++) {
            if (i < traversed.size()-1) {
                System.out.print(traversed.get(i) + "->");
            } else {
                System.out.print(traversed.get(i));
            }
        }
    }

}
