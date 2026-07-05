package DSA.Tree.Traversal.Iterative;

import DSA.Tree.Traversal.Recursion.Postorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
public class Inorder {
    // left root right
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<>(); // store the traversed node of tree
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                arr.add(node.data);
                node = node.right;
            }
        }
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

        Inorder inorder = new Inorder();
        List<Integer> traversed = inorder.inOrder(root);

        for (int i=0; i<traversed.size(); i++) {
            if (i < traversed.size()-1) {
                System.out.print(traversed.get(i) + "->");
            } else {
                System.out.print(traversed.get(i));
            }
        }
    }
}
